package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Shangpin;
import com.accp.domain.Shangpinxiang;
import com.accp.mapper.ShangpinMapper;
import com.github.pagehelper.PageHelper;

@Service
public class ShangpinService {
	@Autowired 
	private ShangpinMapper spm;
	
	public  boolean insertShangpin(Shangpin record) {
		return spm.insert(record)>0;
	}
	
	public boolean updateByPrimaryKey(Shangpin record) {
			return spm.updateByPrimaryKeySelective(record)>0;
	}
	public   List<Shangpin> selectspguanli(Shangpin record, int pageNum, int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Shangpin> list=spm.selectspguanli(record);
		return list;
	}
	
	public   List<Shangpin> selectspAll(Shangpin record){
		//PageHelper.startPage(pageNum, pageSize);
		List<Shangpin> list=spm.selectspguanli(record);
		return list;
	}
	
	public    boolean deleteBYid(String spid) {
		return spm.deleteBYid(spid)>0;
	}
	    
	public    Shangpin selectspno(Integer spno) {
		Shangpin sp=spm.selectspno(spno);
		if (spm.selectspxno(sp.getSpno())!=null) {
			sp.setSpx(spm.selectspxno(sp.getSpno()));
			
		}
		return sp;
	}
	    
	   
	
	
}
