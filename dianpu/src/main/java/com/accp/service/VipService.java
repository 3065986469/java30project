package com.accp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Vip;
import com.accp.domain.Vipdengji;
import com.accp.mapper.VipMapper;
import com.accp.mapper.VipdengjiMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class VipService {

	@Autowired
	private VipMapper vipMapper;
	
	@Autowired
	private VipdengjiMapper vipdengjiMapper;
	
	//子,获取名字查id
	public Vipdengji djname(String name) {
		return vipdengjiMapper.djname(name);
	}
	
	
	//会员信息新增
	public int hyadd(Vip vip) {
		return vipMapper.insert(vip);
	}
	
	//会员带参分页
	public PageInfo<Vip> hyPageQueyr(Integer pageNum,Integer pageSize,Integer djid,String vname){
		Page<Vip> page = PageHelper.startPage(pageNum, pageSize);
		if(djid==0&&vname=="") {
			vipMapper.vipPage();
		}
		if(djid!=0&&vname=="") {
			vipMapper.vipPagedijd(djid);
		}else if(djid==0&&vname!="") {
			vipMapper.vipPageVname(vname);
		}else if(djid!=0&&vname!=""){
			vipMapper.vipPagev(djid, vname);
		}
		return page.toPageInfo();
	}
	
	//会员id查询
	public Vip vipQueryById(int vid) {
		return vipMapper.vipQueryById(vid);
	}
	
	//会员修改
	public int hyupd(Vip vip) {
		return vipMapper.hyupd(vip);
	}
	

}
