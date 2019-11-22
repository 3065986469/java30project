package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Shangpin;
import com.accp.domain.Vip;
import com.accp.service.ShouYinService;

@Controller
@RequestMapping("/shouyin")
public class ShouyinController {
	
	@Autowired
	ShouYinService service;
	
	@RequestMapping("/toCharts")
	public String toCharts() {
		return "charts";
	}
	
	@RequestMapping("/queryAllShangPin")
	@ResponseBody
	public List<Shangpin> queryAllShangPin(){
		return service.queryAllShangPin();
	}
	
	@RequestMapping("/queryShangPinById")
	@ResponseBody
	public Shangpin queryShangPinById(Integer spid){
		return service.queryShangPinById(spid);
	}
	
	@RequestMapping("/queryShangPinByLeiBie")
	@ResponseBody
	public List<Shangpin> queryShangPinByLeiBie(Integer lbid){
		return service.queryShangPinByLeiBie(lbid);
	}
	
	@RequestMapping("/queryAllHuiYuan")
	@ResponseBody
	public List<Vip> queryAllHuiYuan(){
		return service.queryAllHuiYuan();
	}
	
	@RequestMapping("/queryHuiYuanByLeiBie")
	@ResponseBody
	public List<Vip> queryHuiYuanByLeiBie(Integer djid){
		return service.queryHuiYuanByLeiBie(djid);
	}
	
	@RequestMapping("/shiyong")
	@ResponseBody
	public String shiyong(Integer vid){
		return service.shiyong(vid);
	}
}
