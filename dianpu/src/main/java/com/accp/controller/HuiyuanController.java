package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Jifen;
import com.accp.domain.Vip;
import com.accp.domain.Vipdengji;
import com.accp.service.HuiyuanService;
import com.accp.service.JifenService;
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
	  
	 
	
}
