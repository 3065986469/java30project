package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Leibie;
import com.accp.mapper.LeibieMapper;
import com.github.pagehelper.PageHelper;

@Service
public class leibieService {
	@Autowired
	private LeibieMapper lbm;
	
	public List<Leibie> queryleibie(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Leibie> list=lbm.selectleibie();
		return list;
	}
	
	public List<Leibie> queryleibieAll() {
		
		List<Leibie> list=lbm.selectleibie();
		return list;
	}
	
	public Leibie queryprimayKey(Integer lbid) {
		return lbm.selectleibiekey(lbid);
	}
	
	public boolean insertleibie(Leibie record) {
		return lbm.insert(record)>0;
	}
	
	public boolean updateleibie(Leibie record) {
		return lbm.updateByPrimaryKey(record)>0;
	}
	public boolean deleteleibie(Integer lbid) {
		return lbm.deletekey(lbid)>0;
	}
	
}
