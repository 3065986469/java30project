package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Chengjiao;
import com.accp.domain.Guadan;
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
	
	@RequestMapping("/guadan")
	@ResponseBody
	public String guadan(@RequestBody Guadan guadan){
		service.guadan(guadan);
		return "";
	}
	
	@RequestMapping("/queryGuaDanNum")
	@ResponseBody
	public String queryGuaDanNum(){
		return service.queryGuaDanNum();
	}
	
	@RequestMapping("/queryGuaDan")
	@ResponseBody
	public List<Guadan> queryGuaDan(){
		return service.queryGuaDan();
	}
	
	
	@RequestMapping("/queryGuaDanByNo")
	@ResponseBody
	public Guadan queryGuaDanByNo(String cjno){
		return service.queryGuaDanByNo(cjno);
	}
	
	@RequestMapping("/shoukuan")
	@ResponseBody
	public String shoukuan(@RequestBody Chengjiao chengjiao){
		service.shoukuan(chengjiao);
		return "";
	}
	
	@RequestMapping("/deleteGuaDanByNo")
	@ResponseBody
	public String deleteGuaDanByNo(String cjno){
		service.deleteGuaDanByNo(cjno);
		return "";
	}
}
