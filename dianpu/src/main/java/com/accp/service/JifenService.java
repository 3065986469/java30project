package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Jifen;
import com.accp.mapper.JifenMapper;

@Service
@Transactional
public class JifenService {

	@Autowired
	public JifenMapper jifenMapper;
	
	
	//积分查询
	public Jifen jfquery() {
		return jifenMapper.jfquery();
	}
	
	//积分状态修改
	public int jfupd(int sid) {
		return jifenMapper.jfupd(sid);
	}
	
	//积分折扣修改
	public int ifupds(int num) {
		return jifenMapper.jfupds(num);
	}
}
