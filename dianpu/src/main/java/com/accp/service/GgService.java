package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Chicun;
import com.accp.domain.Yanse;
import com.accp.domain.Yanseleibie;
import com.accp.mapper.ChicunMapper;
import com.accp.mapper.YanseMapper;

@Service
public class GgService {
	@Autowired
	private YanseMapper ym;
	@Autowired 
	private ChicunMapper cm;
	
	public List<Yanseleibie> queryys() {
		List<Yanseleibie> yslb= ym.selectYanselb();
		if (yslb!=null) {
			for (Yanseleibie yanseleibie : yslb) {
				yanseleibie.setYs(ym.selectByPrimaryKey(yanseleibie.getYslbid()));
			}
		}
		return yslb;
	}
	
	
	public List<Yanse> queryysAll() {
		List<Yanse> ys= ym.selectByExample(null);
		
		return ys;
	}
	
	
	
	public void insertys(Yanse record) {
		ym.insert(record);
	}		
	
	public List<Chicun> selectccAll() {
		return	cm.selectByExample(null);
	}		
	
	public boolean deleteKey(Integer ccid) {
		return cm.deleteByPrimaryKey(ccid)>0;
	}		
	
	public boolean insetcc(Chicun record) {
		return	cm.insert(record)>0;
	}	
	
	
	
}
