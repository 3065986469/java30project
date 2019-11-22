package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.controller.ShangPin;
import com.accp.domain.Shangpin;
import com.accp.domain.ShangpinExample;
import com.accp.domain.Vip;
import com.accp.mapper.ShangpinMapper;
import com.accp.mapper.VipMapper;

@Service
@Transactional
public class ShouYinService {
	@Autowired
	ShangpinMapper sp;
	@Autowired
	VipMapper v;
	
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
}
