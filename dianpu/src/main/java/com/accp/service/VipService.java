package com.accp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Vip;
import com.accp.domain.Vipdengji;
import com.accp.mapper.VipMapper;
import com.accp.mapper.VipdengjiMapper;

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
		return vipMapper.hyadd(vip);
	}
	

}
