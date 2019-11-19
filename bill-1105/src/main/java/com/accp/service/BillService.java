package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Bill;
import com.accp.mapper.BillMapper;
import com.accp.mapper.SupplierMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class BillService {
	
	@Autowired
	BillMapper bill;
	@Autowired
	SupplierMapper supplier;
	
	public PageInfo<Bill> query(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		Page<Bill> list=(Page<Bill>) bill.query();
		return list.toPageInfo();
	}
	
	public int del(String id){
		return bill.deleteByPrimaryKey(id);
	}
}
