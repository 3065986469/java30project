package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Dianpu;
import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwei;
import com.accp.service.DianPuService;
@Controller
@RequestMapping("/dianpu")
public class DianpuController {
	@Autowired
	DianPuService service;
	
	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index";
	}
	@RequestMapping("/go")
	public String go(String method) {
		return method;
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	
	@RequestMapping("/queryAllDianPu")
	@ResponseBody
	public List<Dianpu> queryAllDianPu() {
		return service.queryAllDianPu();
	}
	
	@RequestMapping("/denglu")
	public String denglu(String name,String pwd,HttpSession sess) {
		Yuangong yg= service.queryByNameAndPwd(name, pwd);
		if(yg==null) {
			return "login";
		}else {
			sess.setAttribute("user", yg);
			return "redirect:toIndex";
		}
	}
	
	@RequestMapping("/insertDianPu")
	@ResponseBody
	public String insertDianPu(Dianpu dianpu) {
		service.insertDianPu(dianpu);
		return "";
	}
	
	@RequestMapping("/queryAllZhiWei")
	@ResponseBody
	public List<Zhiwei> queryAllZhiWei() {
		return service.queryAllZhiWei();
	}
	
	@RequestMapping("/queryAllZhiWei2")
	@ResponseBody
	public List<Zhiwei> queryAllZhiWei2() {
		return service.queryAllZhiWei2();
	}
	
	
	@RequestMapping("/queryAllYuanGong")
	@ResponseBody
	public List<Yuangong> queryAllYuanGong() {
		return service.queryAllYuanGong();
	}
	
	@RequestMapping("/yuangongguanliquery")
	@ResponseBody
	public List<Yuangong> yuangongguanliquery(String ygname) {
		return service.yuangongguanliquery(ygname);
	}
	
	@RequestMapping("/yuangongguanliqueryByDianPu")
	@ResponseBody
	public List<Yuangong> yuangongguanliqueryByDianPu(Integer dpid) {
		return service.yuangongguanliqueryByDianPu(dpid);
	}
	
	@RequestMapping("/yuangongguanliqueryByZhiWei")
	@ResponseBody
	public List<Yuangong> yuangongguanliqueryByZhiWei(Integer zwid) {
		return service.yuangongguanliqueryByZhiWei(zwid);
	}
	
	@RequestMapping("/insertYuanGong")
	@ResponseBody
	public String insertYuanGong(Yuangong yuangong) {
		service.insertYuanGong(yuangong);
		return "";
	}

}
