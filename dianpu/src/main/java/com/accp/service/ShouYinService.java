package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.controller.ShangPin;
import com.accp.domain.Chengjiao;
import com.accp.domain.Chengjiaoxiang;
import com.accp.domain.Guadan;
import com.accp.domain.GuadanExample;
import com.accp.domain.Guadanxiang;
import com.accp.domain.Shangpin;
import com.accp.domain.ShangpinExample;
import com.accp.domain.Vip;
import com.accp.mapper.ChengjiaoMapper;
import com.accp.mapper.ChengjiaoxiangMapper;
import com.accp.mapper.GuadanMapper;
import com.accp.mapper.GuadanxiangMapper;
import com.accp.mapper.ShangpinMapper;
import com.accp.mapper.VipMapper;

@Service
@Transactional
public class ShouYinService {
	@Autowired
	ShangpinMapper sp;
	@Autowired
	VipMapper v;
	@Autowired
	GuadanMapper gd;
	@Autowired
	GuadanxiangMapper gdx;
	@Autowired
	ChengjiaoMapper cj;
	@Autowired
	ChengjiaoxiangMapper cjx;
	
	public List<Shangpin> queryAllShangPin(){
		return sp.selectByExample(null);
	}
	
	public Shangpin queryShangPinById(Integer spid){
		return sp.selectByPrimaryKey(spid);
	}
	
	public List<Shangpin> queryShangPinByLeiBie(Integer lbid){
		ShangpinExample s=new ShangpinExample();
		s.createCriteria().andLbidEqualTo(lbid);
		return sp.selectByExample(s);
	}
	
	public List<Vip> queryAllHuiYuan(){
		return v.queryAllHuiYuan();
	}
	
	public List<Vip> queryHuiYuanByLeiBie(Integer djid){
		return v.queryHuiYuanByLeiBie(djid);
	}
	
	public String shiyong(Integer vid){
		return v.shiyong(vid);
	}
	
	public int guadan(Guadan guadan){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String d=df.format(new Date());
		String []a=d.split(" |:|-");
		String cjno="";
		for (String string : a) {
			cjno+=string;
		}
		guadan.setCjno(cjno);
		guadan.setGddate(new Date());
		gd.guadan(guadan);
		gdx.guadan(guadan.getList(), cjno);
		return 0;
		 
	}
	
	public String queryGuaDanNum(){
		return gd.queryGuaDanNum();
	}
	
	public List<Guadan> queryGuaDan(){
		return gd.queryGuaDan();
	}
	
	public Guadan queryGuaDanByNo(String cjno){
		Guadan g=gd.queryGuaDanByNo(cjno);
		if(g.getHyid()==0) {
			List<Guadanxiang> g2=gdx.queryGuaDanByNo2(cjno);
			g.setList(g2);
		}else {
			List<Guadanxiang> g2=gdx.queryGuaDanByNo(cjno);
			g.setList(g2);
		}
		return g;
	}
	
	
	public int shoukuan(Chengjiao chengjiao){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String d=df.format(new Date());
		String []a=d.split(" |:|-");
		String cjno="";
		for (String string : a) {
			cjno+=string;
		}
		int num=0;
		for (Chengjiaoxiang string : chengjiao.getList()) {
			num+=string.getCjxnum();
		}
		
		chengjiao.setCjnum(num);
		chengjiao.setCjno(cjno);
		chengjiao.setCjdate(new Date());
		cj.insert(chengjiao);
		cjx.shoukuan(chengjiao.getList(), cjno);
		return 0;
	}
	
	public int deleteGuaDanByNo(String cjno){
		gd.deleteGuaDanByNo(cjno);
		gdx.deleteGuaDanByNo(cjno);
		return 0;
	}
}
