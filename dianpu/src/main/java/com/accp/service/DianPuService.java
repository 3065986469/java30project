package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Dianpu;
import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwei;
import com.accp.mapper.DianpuMapper;
import com.accp.mapper.YuangongMapper;
import com.accp.mapper.ZhiweiMapper;

@Service
@Transactional
public class DianPuService {
	
	@Autowired
	YuangongMapper yg;
	@Autowired
	DianpuMapper dp;
	@Autowired
	ZhiweiMapper zw;
	
	
	public Yuangong queryByNameAndPwd(String name,String pwd) {
		return yg.queryByNameAndPwd(name, pwd);
	}
	
	
	public List<Dianpu> queryAllDianPu() {
		return dp.queryAllDianPu();
	}
	
	public int insertDianPu(Dianpu dianpu) {
		String dpid=dp.queryDianPuId();
		int id=Integer.parseInt(dpid)+1;
		dianpu.setDpid(id+"");
		dianpu.setSid(1);
		return dp.insert(dianpu);
	}
	
	public List<Zhiwei> queryAllZhiWei() {
		return zw.queryAllZhiWei();
	}
	
	public List<Yuangong> queryAllYuanGong() {
		return yg.queryAllYuanGong();
	}
}
