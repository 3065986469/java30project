package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Bill;
import com.accp.service.BillService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	BillService service;
	
	@RequestMapping("/toBill")
	public String toBill() {
		return "bill";
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public PageInfo<Bill> query(Integer pageNum,Integer pageSize){
		return service.query(pageNum,pageSize);
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public String query(String ids){
		String [] ids2=ids.split(",");
		for (String string : ids2) {
			service.del(string);
		}
		return "";
	}
}
