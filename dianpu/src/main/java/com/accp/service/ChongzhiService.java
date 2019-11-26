package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Chongzhi;
import com.accp.domain.Vip;
import com.accp.mapper.ChongzhiMapper;
import com.accp.mapper.VipMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ChongzhiService {
	@Autowired
	private VipMapper vipmapper;
	
	@Autowired
	private ChongzhiMapper chongzhiMapper;
	
	//模糊查询信息
	public List<Vip> czQueryName(String vname) {
		return vipmapper.czQueryName(vname);
	}
	
	//查询id
	public Vip czQueryByName(String vname) {
		return vipmapper.czQueryByIdName(vname);
	}
	
	
	//充值添加
	public int czadd(Chongzhi chongzhi) {
		return chongzhiMapper.czadd(chongzhi);
	}
	
	//分页
	public PageInfo<Chongzhi> czquery(int pageNum,int pageSize,String date,String dates,String vname){
		Page<Chongzhi> page=PageHelper.startPage(pageNum, pageSize);
		if(vname!=""&&date=="") {
			chongzhiMapper.pageQueryVname(vname);
		}else if(vname==""&&date!="") {
			chongzhiMapper.pageQueryDate(date, dates);
		}else if(vname!=""&&date!=""){
			chongzhiMapper.pageQueryVnameDate(date, dates, vname);
		}else {
			chongzhiMapper.pageQuery();
		}
		return page.toPageInfo();
		
	}
}
