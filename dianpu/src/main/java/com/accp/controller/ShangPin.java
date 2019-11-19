package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Leibie;
import com.accp.domain.Shangpin;
import com.accp.domain.Yanse;
import com.accp.domain.Yanseleibie;
import com.accp.service.GgService;
import com.accp.service.ShangpinService;
import com.accp.service.leibieService;

@Controller
@RequestMapping("shangping")
public class ShangPin {
	@Autowired
	private leibieService lbs;
	@Autowired
	private ShangpinService sps;
	
	@Autowired
	private GgService gs;
	
	
	@RequestMapping(value="cxleibie")
	@ResponseBody
	public List<Leibie> queryleibie() {
		return lbs.queryleibie();
	}
	
	
	@RequestMapping(value="querylbkey")
	@ResponseBody
	public Leibie queryleibie(Integer lbid) {
		return lbs.queryprimayKey(lbid);
	}
	
	
	@RequestMapping(value="insertlb")
	@ResponseBody
	public String insertleibie(Leibie record) {
		lbs.insertleibie(record);
		return "新增成功！！！";
	}
	
	@RequestMapping(value="updatelb")
	@ResponseBody
	public String updateleibie(Leibie record) {
		lbs.updateleibie(record);
		return "修改成功！！！";
	}
	@RequestMapping(value="deleteleibie")
	@ResponseBody
	public String deleteleibie(Integer lbid) {
		lbs.deleteleibie(lbid);
		return "1";
	}
	
	@RequestMapping(value="shangpcx")
	@ResponseBody
	public List<Shangpin> shangpcx(Shangpin record){
		return sps.selectspguanli(record);
	}
	
	@RequestMapping(value="insertsp")
	@ResponseBody
	public int insertsp(Shangpin record,MultipartFile [] file){
		String spimg="";
		for (int i = 0; i < file.length; i++) {
			String xname=file[i].getOriginalFilename();
			String saffet=xname.substring(xname.lastIndexOf("."));
					 xname=UUID.randomUUID()+"1"+saffet;
					File f=new File("D:/img/"+xname);
					spimg+="D:/img/"+xname+",";
				try {
					file[i].transferTo(f);
				}  catch (Exception e) {
					return 0;
				}	
		}
		record.setSpimg(spimg);
		sps.insertShangpin(record);
		return 1;
	}
	
	@RequestMapping(value="updatesp")
	@ResponseBody
	public int updatesp(Shangpin record,MultipartFile [] file){
		String spimg="";
		for (int i = 0; i < file.length; i++) {
			String xname=file[i].getOriginalFilename();
			String saffet=xname.substring(xname.lastIndexOf("."));
					 xname=UUID.randomUUID()+"1"+saffet;
					File f=new File("D:/img/"+xname);
					spimg+="D:/img/"+xname+",";
				try {
					file[i].transferTo(f);
				}  catch (Exception e) {
					return 0;
				}	
		}
		if (!"".equals(spimg)&&spimg!=null) {
			record.setSpimg(spimg);
		}
		
		sps.updateByPrimaryKey(record);
		return 1;
	}
	@RequestMapping(value="deletesp")
	@ResponseBody
	public int deletesp(Integer spid) {
		sps.deleteBYid(spid);
		return 1;
	}
	
	@RequestMapping(value="queryys")
	@ResponseBody
	public List<Yanseleibie> queryys() {
		return gs.queryys();
	}
	
	@RequestMapping(value="insertys")
	@ResponseBody
	public int insertys(Yanse record,MultipartFile file) {
		String xname=file.getOriginalFilename();
		String saffet=xname.substring(xname.lastIndexOf("."));
				 xname=UUID.randomUUID()+"1"+saffet;
				File f=new File("D:/img/"+xname);
				record.setYsimg("D:/img/"+xname);
			try {
				file.transferTo(f);
			}  catch (Exception e) {
				return 0;
			}	
		gs.insertys(record);
		return 1;
	}
	
	
	
}
