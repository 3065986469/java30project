package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Chengjiao;
import com.accp.mapper.ChengjiaoMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ChengjiaoService {

	@Autowired
	private ChengjiaoMapper chengjiaoMapper;
	
	
	//成交记录按订单查询
	public PageInfo<Chengjiao> dingdanQuery(int pageNum,int pageSize,String date,String dates,String vname){
		Page<Chengjiao> page=PageHelper.startPage(pageNum, pageSize);
		if(vname!=""&&date=="") {
			chengjiaoMapper.pageQueryVname(vname);
		}else if(vname==""&&date!="") {
			chengjiaoMapper.pageQueryDate(date, dates);
		}else if(vname!=""&&date!=""){
			chengjiaoMapper.pageQueryVnameDate(date, dates, vname);
		}else {
			chengjiaoMapper.query();
		}
		return page.toPageInfo();
		
	}
}
