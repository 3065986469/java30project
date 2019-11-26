package com.accp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Chengjiao;
import com.accp.domain.Chengjiaoxiang;
import com.accp.domain.Chongzhi;
import com.accp.domain.Jifen;
import com.accp.domain.Vip;
import com.accp.domain.Vipdengji;
import com.accp.service.ChengjiaoService;
import com.accp.service.ChengjiaoxiangService;
import com.accp.service.ChongzhiService;
import com.accp.service.HuiyuanService;
import com.accp.service.JifenService;
import com.accp.service.ShangpinService;
import com.accp.service.VipService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/huiyuan")
public class HuiyuanController {
	
	@Autowired
	HuiyuanService huiyuanService;
	
	@Autowired
	JifenService jifenService;
	
	@Autowired
	VipService vipService;
	
	@Autowired
	ChongzhiService chongzhiService;
	
	@Autowired
	ChengjiaoService chengjiaoService;
	
	@Autowired
	ShangpinService shangpinService;
	
	@Autowired
	ChengjiaoxiangService chengjiaoxiangService;

	@RequestMapping("/toForms")
	public String toForms() {
		return "forms";
	}	
	
	
	//等级查询
	@RequestMapping("djquery")
	@ResponseBody
	public List<Vipdengji> querydj(){
		return huiyuanService.query();
	}
	
	//子，获取名单查id
	@RequestMapping("jdname")
	@ResponseBody
	public Vipdengji jdname(String name) {
		return vipService.djname(name);
	}
	
	//会员信息新增
	@RequestMapping("hyadd")
	@ResponseBody
	public String hyadd(@RequestBody Vip vip) {
		vipService.hyadd(vip);
		return null;
	}
	
	//会员分页带参查询
	@RequestMapping("hyPageQueyr")
	@ResponseBody
	public PageInfo<Vip> hyPageQueyr(Integer pageNum,Integer pageSize,Integer djid,String vname){
		return vipService.hyPageQueyr(pageNum, pageSize, djid, vname);
	}
	
	//会员id查询
	@RequestMapping("vipQueryById")
	@ResponseBody
	public Vip vipQueryById(int vid) {
		return vipService.vipQueryById(vid);
	}
	
	//会员修改
	@RequestMapping("hyupd")
	@ResponseBody
	public String hyupd(@RequestBody Vip vip) {
		vipService.hyupd(vip);
		return null;
	}
	
	
	
	
	//添加等级
	@RequestMapping("djadd")
	@ResponseBody
	public String djadd(@RequestBody Vipdengji vipdengji) {
		huiyuanService.add(vipdengji);
		return null;	
	}
	
	
	//删除等级
	@RequestMapping("djdel")
	@ResponseBody
	public	String djdel(Integer djid) {
		huiyuanService.del(djid);
		return null;
	}
	
	//按id查询等级
	  @RequestMapping("djQueryById")
	  @ResponseBody 
	  public Vipdengji djQueryById(Integer djid) {
		  return huiyuanService.djQueryById(djid);
	  }
	  
	//修改等级
	  @RequestMapping("djupd")
	  @ResponseBody
	  public String jdupd(@RequestBody Vipdengji vipdengji) {
		  huiyuanService.jdupd(vipdengji);
		  return null;
	  }
	  
	  
	  //积分查询
	  @RequestMapping("jfquery")
	  @ResponseBody
	  public Jifen jfquery() {
		  return jifenService.jfquery();
	  }
	  
	  
	  //积分状态修改
	  @RequestMapping("jfupd")
	  @ResponseBody
	  public int jfupd(Integer sid) {
		  return jifenService.jfupd(sid);
	  }
	  
	  //积分折扣修改
	  @RequestMapping("jfupds")
	  @ResponseBody
	  public int jfupds(Integer num) {
		  return jifenService.ifupds(num);
	  }
	  
	  
	  //充值折扣模糊查询姓名
	  @RequestMapping("czQueryName")
	  @ResponseBody
	  public List<Vip> czQueryName(String vname) {
		  return chongzhiService.czQueryName(vname);
	  }
	  
	  //充值折扣按姓名查id
	  @RequestMapping("czQueryByName")
	  @ResponseBody
	  public Vip czQueryByName(String vname) {
		  return chongzhiService.czQueryByName(vname);
	  }
	  
	  //充值表添加
	  @RequestMapping("czadd")
	  @ResponseBody
	  public String czadd(@RequestBody Chongzhi chongzhi) {
		  chongzhi.setCzdate(new Date());
		  System.out.println(chongzhi.getCzdate());
		  chongzhiService.czadd(chongzhi);
		  return null;
	  }
	  
	  //充值后修改会员余额
	  @RequestMapping("updVipYe")
	  @ResponseBody
	  public String updVipYe(Integer vid,float yue) {
		  vipService.updVipYe(vid, yue);
		  return null;
	  }
	  
	  
	
	  //充值折扣查询
	  @RequestMapping("zkquery")	  
	  @ResponseBody 
	  	public PageInfo<Chongzhi> czquery(int pageNum,int pageSize,String date1,String date2,String vname){ 
		  String date=date1.replaceAll("-",""); 
		  String dates=date2.replaceAll("-",""); 
		  int i=date.indexOf(date); 
		  int s=date.indexOf(dates); 
		  if(s<i) { 
			  String d=null;
			  d=date1;
			  date=date2;
			  dates=d;
		  } 
		   return chongzhiService.czquery(pageNum, pageSize, date, dates, vname);
	  }
	  
	  
	  //成交记录按订单查询
	  @RequestMapping("dingdanQuery")	  
	  @ResponseBody 
	  	public PageInfo<Chengjiao> dingdanQuery(int pageNum,int pageSize,String date1,String date2,String vname){ 
		  String date=date1.replaceAll("-",""); 
		  String dates=date2.replaceAll("-",""); 
		  int i=date.indexOf(date); 
		  int s=date.indexOf(dates); 
		  if(s<i) { 
			  String d=null;
			  d=date1;
			  date=date2;
			  dates=d;
		  } 
		   return chengjiaoService.dingdanQuery(pageNum, pageSize, date, dates, vname);
	  }
	  
	  
	  //按商品查询
	  @RequestMapping("shangpin")	  
	  @ResponseBody 
	  	public PageInfo<Chengjiaoxiang> shangpin(int pageNum,int pageSize,String date1,String date2,String vname){ 
		   return chengjiaoxiangService.dingdanQuery(pageNum, pageSize, vname);
	  }
	 
	
}
