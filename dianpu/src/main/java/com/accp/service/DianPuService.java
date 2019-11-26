package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Dianpu;
import com.accp.domain.Qu;
import com.accp.domain.QuExample;
import com.accp.domain.Quanxian;
import com.accp.domain.Shengfen;
import com.accp.domain.ShengfenExample;
import com.accp.domain.Shi;
import com.accp.domain.ShiExample;
import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwei;
import com.accp.mapper.DianpuMapper;
import com.accp.mapper.QuMapper;
import com.accp.mapper.QuanxianMapper;
import com.accp.mapper.ShengfenMapper;
import com.accp.mapper.ShiMapper;
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
	@Autowired
	QuanxianMapper qx;
	@Autowired
	ShengfenMapper sf;
	@Autowired
	ShiMapper s;
	@Autowired
	QuMapper q;

	public Yuangong queryByNameAndPwd(String name, String pwd) {
		return yg.queryByNameAndPwd(name, pwd);
	}

	public List<Dianpu> queryAllDianPu() {
		List<Dianpu> l=dp.queryAllDianPu();
		for (Dianpu d : l) {
			String []a=d.getDpaddress().split("-");
			Shengfen sf=queryShengFenById(Integer.parseInt(a[0]));
			Shi s=queryShiById2(Integer.parseInt(a[1]));
			Qu q=queryQuById2(Integer.parseInt(a[2]));
			d.setDpaddress(sf.getSfname()+s.getSname()+q.getQname());
		}
		return l;
	}

	public int insertDianPu(Dianpu dianpu) {
		String dpid = dp.queryDianPuId();
		System.out.println("dpid"+dpid);
		int id = Integer.parseInt(dpid) + 1;
		System.out.println(id);
		dianpu.setDpid(id + "");
		dianpu.setSid(1);
		return dp.insert(dianpu);
	}

	public List<Zhiwei> queryAllZhiWei() {
		return zw.queryAllZhiWei();
	}

	public List<Zhiwei> queryAllZhiWei2() {
		return zw.queryAllZhiWei2();
	}

	public List<Yuangong> queryAllYuanGong() {
		return yg.queryAllYuanGong();
	}

	public List<Yuangong> yuangongguanliquery(String ygname) {
		return yg.yuangongguanliquery(ygname);
	}

	public List<Yuangong> yuangongguanliqueryByDianPu(int dpid) {
		if (dpid == 0) {
			return yg.queryAllYuanGong();
		}
		return yg.yuangongguanliqueryByDianPu(dpid);
	}

	public List<Yuangong> yuangongguanliqueryByZhiWei(int zwid) {
		if (zwid == 0) {
			return yg.queryAllYuanGong();
		}
		return yg.yuangongguanliqueryByZhiWei(zwid);
	}

	public int insertYuanGong(Yuangong yuangong) {
		yuangong.setSid(1);
		return yg.insert(yuangong);
	}

	public List<Quanxian> queryQuanXian() {
		List<Quanxian> l1 = qx.queryQuanXianLeiBie();
		List<Quanxian> l2 = qx.queryQuanXian();
		List<Quanxian> l3 = new ArrayList<Quanxian>();

		for (Quanxian quanxian : l1) {
			l3.add(quanxian);
		}
		for (Quanxian quanxian : l2) {
			l3.add(quanxian);
		}

		return l3;
	}

	public int insertZhiWei(Zhiwei zhiwei) {
		zhiwei.setSid(1);
		return zw.insert(zhiwei);
	}

	public Zhiwei queryZhiWeiById(Integer zwid) {
		Zhiwei z=zw.selectByPrimaryKey(zwid);
		String a=z.getQxid();
		String []b=a.split(",");
		List<String> l=new ArrayList<String>();
		for (String id :b) {
			l.add(id);
		}
		z.setQxids(l);
		return z;
	}

	public int updateZhiWei(Zhiwei zhiwei) {
		zhiwei.setSid(1);
		return zw.updateByPrimaryKey(zhiwei);
	}

	public int deleteZhiWei(Zhiwei zhiwei) {
		zhiwei.setSid(0);
		return zw.updateByPrimaryKey(zhiwei);
	}

	public Yuangong queryYuanGongById(Integer ygid) {
		return yg.selectByPrimaryKey(ygid);
	}

	public int updateYuanGong(Yuangong yuangong) {
		yuangong.setSid(1);
		return yg.updateByPrimaryKey(yuangong);
	}

	public int deleteYuanGong(Yuangong yuangong) {
		yuangong.setSid(0);
		return yg.updateByPrimaryKey(yuangong);
	}
	
	public List<Shengfen> querysheng() {
		return sf.selectByExample(null);
	}
	
	public List<Shi> queryshi() {
		return s.selectByExample(null);
	}
	
	public Shengfen queryShengFenById(Integer sfid) {
		return sf.selectByPrimaryKey(sfid);
	}
	
	public Shi queryShiById2(Integer sfid) {
		return s.selectByPrimaryKey(sfid);
	}
	
	public Qu queryQuById2(Integer sid) {
		return q.selectByPrimaryKey(sid);
	}
	
	public List<Shi> queryShiById(Integer sfid) {
		ShiExample a=new ShiExample();
		a.createCriteria().andSfidEqualTo(sfid);
		return s.selectByExample(a);
	}
	
	public List<Shi> queryShi() {
		return s.selectByExample(null);
	}
	
	public List<Qu> queryQuById(Integer sid) {
		QuExample a=new QuExample();
		a.createCriteria().andSidEqualTo(sid);
		return q.selectByExample(a);
	}
	
	public List<Qu> queryQu() {
		return q.selectByExample(null);
	}
	
	
	public Dianpu queryDianPuById(Integer dpid) {
		return dp.queryDianPuById(dpid);
	}
	
	public int deleteDianPu(Dianpu dianpu) {
		dianpu.setSid(0);
		return dp.updateByPrimaryKey(dianpu);
	}
	
	public int updateDianPu(Dianpu dianpu) {
		dianpu.setSid(1);
		return dp.updateByPrimaryKey(dianpu);
	}
	
	public List<Quanxian> queryAllQuanXian(){
		return qx.queryQuanXian();
	}
	
	public Zhiwei queryQuanXianByYuanGongId(Integer ygid){
		return zw.queryQuanXianByYuanGongId(ygid);
	}
}
