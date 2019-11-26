package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Chengjiaoxiang;
import com.accp.mapper.ChengjiaoxiangMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ChengjiaoxiangService {

	@Autowired
	private ChengjiaoxiangMapper chengjiaoxiangMapper;
	
	public PageInfo<Chengjiaoxiang> dingdanQuery(int pageNum,int pageSize,String vname){
		Page<Chengjiaoxiang> page=PageHelper.startPage(pageNum, pageSize);
		if(vname!="") {
			chengjiaoxiangMapper.queryByName(vname);
		}else {
			chengjiaoxiangMapper.query();
		}
		return page.toPageInfo();
		
	}
}
