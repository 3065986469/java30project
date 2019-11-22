package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Chicun;
import com.accp.domain.Gongyingshang;
import com.accp.domain.Leibie;
import com.accp.domain.Shangpin;
import com.accp.domain.Shangpinxiang;
import com.accp.domain.Yanse;
import com.accp.domain.Yanseleibie;
import com.accp.service.GgService;
import com.accp.service.GongyingshangService;
import com.accp.service.ShangpinService;
import com.accp.service.leibieService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("shangping")
public class ShangPin {
	@Autowired
	private leibieService lbs;
	@Autowired
	private ShangpinService sps;
	
	@Autowired
	private GgService gs;
	
	@Autowired
	private GongyingshangService gyss;
	
	@RequestMapping(value="cxleibie")
	@ResponseBody
	public PageInfo<Leibie> queryleibie(Integer pageNum, Integer pageSize) {
		//System.out.println(pageNum+"");
		Page<Leibie> page=(Page<Leibie>)lbs.queryleibie(pageNum,pageSize);
		return page.toPageInfo();
	}
	
	
	@RequestMapping(value="leibieAll")
	@ResponseBody
	public List<Leibie> queryleibieAll() {
		//System.out.println(pageNum+"");
		
		return lbs.queryleibieAll();
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
	public PageInfo<Shangpin> shangpcx(Shangpin record, int pageNum, int pageSize){
		Page<Shangpin> page=(Page<Shangpin>)sps.selectspguanli(record, pageNum, pageSize);
		return page.toPageInfo();
	}
	
	
	@RequestMapping(value="shangpincma")
	@ResponseBody
	public List<Chicun> cma() {
		return gs.selectccAll();
	}
	
	
	
	@RequestMapping(value="shangpinidkey")
	public String shangpinidkey(HttpSession session,String method,Integer spno){
		session.setAttribute("shangpinidkey", sps.selectspno(spno));
		return method;
	}
	
	@RequestMapping(value="sessionkey")
	@ResponseBody
	public Shangpin spsessionkey(HttpSession session){
		Shangpin spp=(Shangpin) session.getAttribute("shangpinidkey");
		//session.removeAttribute("shangpinidkey");
		return spp;
	}
	
	
	
	
	@RequestMapping(value="insertsp")
	@ResponseBody
	public int insertsp(@RequestBody Shangpin record,MultipartFile [] file){
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
		sps.insertShangpin(record);
		return 1;
	}
	
	@RequestMapping(value="updatesp")
	@ResponseBody
	public int updatesp(@RequestBody Shangpin record,MultipartFile [] file){
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
	public int deletesp(String spid) {
		sps.deleteBYid(spid);
		return 1;
	}
	
	
	
	
	@RequestMapping("/excelUpload")
	@ResponseBody
	public int excelUpload(MultipartFile file) {
		try {
			//将传入的文件转换成excel
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				
				int rows = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rows;j++) {
					//根据下标获取行
					Shangpin spin=new Shangpin();
					String spnoo="";
				//	int rows = sheet.getPhysicalNumberOfRows();
					Row row = sheet.getRow(j);
					Cell leibieCell = row.getCell(0);
					Cell shangpnameCell = row.getCell(1);
					//Cell birthdayCell = row.getCell(2);
					
					List<Leibie> lbssa=lbs.queryleibieAll();
					
					for (Leibie leibie : lbssa) {
						if (leibie.getLbname()==leibieCell.getStringCellValue()) {
							spin.setLbid(leibie.getLbid());
						}
					}
					List<Shangpinxiang> lsp=new ArrayList<Shangpinxiang>();
					Integer spxcount=0;
					for(int n=1;n<rows;n++) {
						Row rowas = sheet.getRow(n);
						Cell shangpinxmCell = row.getCell(1);
						Cell shangpinysCell = row.getCell(4);
						Cell shangpinccCell = row.getCell(5);
						Cell shangpinkcCell = row.getCell(6);
						Cell shangpinxsCell = row.getCell(7);
						Cell shangpincbCell = row.getCell(8);
						Integer index=0;
						if (shangpnameCell.getStringCellValue()==shangpinxmCell.getStringCellValue()) {
							spin.setSpname(shangpinxmCell.getStringCellValue());
							Object xs=shangpinxsCell.getNumericCellValue();
							Object cb=shangpincbCell.getNumericCellValue();
							spin.setSpxiaoshou((float)xs);
							spin.setSpchengben((float)cb);
							if(index==0) {
								spnoo=new Date()+"1";
							}
							spin.setSpno(spnoo);
							
							Shangpinxiang spx=new Shangpinxiang();
							spx.setSpno(spnoo);
							spx.setSpxid(0);
							spx.setSpxtm(new Date()+"1"+n);
							spx.setYsname(shangpinysCell.getStringCellValue());
							spx.setCcname(shangpinccCell.getStringCellValue());
							Object oo=shangpinkcCell.getNumericCellValue();
							spxcount+=(int)oo;
							spx.setSpxcount((int)oo);
							lsp.add(spx);
							
							index++;
						}
					}
					spin.setSid(1);
					spin.setSpcount(spxcount);
					spin.setSpx(lsp);
					sps.insertShangpin(spin);
					//service.add(stu);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(Shangpin stu){
		//查询出需要导出的学生
		List<Shangpin> list = sps.selectspAll(stu);
		//导出学生信息为excel
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("类别");
		titleRow.createCell(1).setCellValue("商品名称");
		titleRow.createCell(2).setCellValue("商品货号");
		titleRow.createCell(3).setCellValue("条码");
		titleRow.createCell(4).setCellValue("颜色");
		titleRow.createCell(5).setCellValue("尺寸");
		titleRow.createCell(6).setCellValue("库存");
		titleRow.createCell(7).setCellValue("销售价");
		titleRow.createCell(8).setCellValue("成本价");
		//SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<list.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell splbCell = row.createCell(0);
			splbCell.setCellValue(list.get(i).getLbname());
			Cell spmcCell = row.createCell(1);
			spmcCell.setCellValue(list.get(i).getSpname());
			Cell sphhCell = row.createCell(2);
			sphhCell.setCellValue(list.get(i).getSpno());
			Cell sptmCell = row.createCell(3);
			sptmCell.setCellValue(list.get(i).getSpxtm());
			Cell spysCell = row.createCell(4);
			spysCell.setCellValue(list.get(i).getYsname());
			Cell spccCell = row.createCell(5);
			spccCell.setCellValue(list.get(i).getCcname());
			Cell spkcCell = row.createCell(6);
			spkcCell.setCellValue(list.get(i).getSpxcount());
			Cell spxsCell = row.createCell(7);
			spxsCell.setCellValue(list.get(i).getSpxiaoshou());
			Cell spcbCell = row.createCell(8);
			spcbCell.setCellValue(list.get(i).getSpchengben());
//			if(list.get(i).getBirthday()!=null) {
//				birtydayCell.setCellValue(f.format(list.get(i).getBirthday()));
//			}
			
		}
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("商品信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="querygysAll")
	@ResponseBody
	public List<Gongyingshang> querygysAll(String gysname,String gysaddress) {
		//System.out.println(pageNum+"");
		Gongyingshang r=new Gongyingshang();
		r.setGysaddress(gysaddress);
		r.setGysname(gysname);
		return gyss.selectAll(r);
	}
	
	@RequestMapping(value="querygyskey")
	@ResponseBody
	public Gongyingshang querygyskey(Integer gysid) {
		return gyss.selectkey(gysid);
	}
	
	
	@RequestMapping(value="insertgys")
	@ResponseBody
	public String insertgongyingshang(@RequestBody Gongyingshang record) {
		gyss.insertgys(record);
		return "新增成功！！！";
	}
	
	@RequestMapping(value="updategys")
	@ResponseBody
	public String updategys(@RequestBody Gongyingshang record) {
		gyss.updategys(record);
		return "修改成功！！！";
	}
	@RequestMapping(value="deletegys")
	@ResponseBody
	public String deletegys(Integer gysid) {
		gyss.deletegys(gysid);
		return "1";
	}
	
	
	
	
	
	
	
}
