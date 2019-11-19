package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Vipdengji;
import com.accp.service.HuiyuanService;

@Controller
@RequestMapping("/huiyuan")
public class HuiyuanController {
	
	@Autowired
	HuiyuanService huiyuanService;

	@RequestMapping("/toForms")
	public String toForms() {
		return "forms";
	}
	
	
	//等级查询
	@RequestMapping("query")
	@ResponseBody
	public List<Vipdengji> query(){
		return huiyuanService.query();
	}
	
	
	//添加等级
	@RequestMapping("add")
	@ResponseBody
	public String add(@RequestBody Vipdengji vipdengji) {
		huiyuanService.add(vipdengji);
		return null;	
	}
	
	
	//删除等级
	@RequestMapping("del")
	@ResponseBody
	public	String del(Integer djid) {
		huiyuanService.del(djid);
		return null;
	}
	
	/*
	 * //按id查询等级
	 * 
	 * @RequestMapping("djQueryById")
	 * 
	 * @ResponseBody public Vipdengji djQueryById(Integer djid) {
	 * 
	 * }
	 */
	
}
