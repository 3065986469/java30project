package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Vipdengji;
import com.accp.mapper.VipdengjiMapper;

@Service
public class HuiyuanService {

	@Autowired
	
	private VipdengjiMapper vipdengjiMapper;
	
	
	//等级查询
	public List<Vipdengji> query(){
		return vipdengjiMapper.selectByExample(null);
	}
	
	//等级增加
	public int add(Vipdengji vipdengji) {
		return vipdengjiMapper.insert(vipdengji);	
	}
	
	//按id删除等级
	public int del(int djid) {
		return vipdengjiMapper.deleteByPrimaryKey(djid);
	}
	
	//按id查询等级
	/*
	 * public Vipdengji djQueryById(int id) { return vipdengjiMapper.select }
	 */
}
