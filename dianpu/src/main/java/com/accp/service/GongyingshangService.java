package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Gongyingshang;
import com.accp.mapper.GongyingshangMapper;

@Service
public class GongyingshangService {
	@Autowired
	private GongyingshangMapper gysm;
	
	public List<Gongyingshang> selectAll(Gongyingshang r) {
		return gysm.selectAll(r);
	}
	public Gongyingshang selectkey(Integer gysid) {
			return gysm.selectByPrimaryKey(gysid);
	}
	public boolean insertgys(Gongyingshang record) {
		return gysm.insert(record)>0;
	}
	public boolean updategys(Gongyingshang record) {
		return gysm.updateByPrimaryKey(record)>0;
	}
	public boolean deletegys(Integer record) {
		return gysm.deletegysid(record)>0;
	}
}
