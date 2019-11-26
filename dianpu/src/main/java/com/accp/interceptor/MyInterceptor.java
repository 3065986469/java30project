package com.accp.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.accp.domain.Quanxian;
import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwei;
import com.accp.service.DianPuService;

@Component//让spring容器创建该类对象，表示其它组建
public class MyInterceptor implements HandlerInterceptor{

	@Autowired
	DianPuService service;
	/***
	 * 
	 * 执行控制器之前执行该方法，返回false表示不执行控制器
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Yuangong yg=(Yuangong)request.getSession().getAttribute("user");
		if(yg==null) {
			return false;
		}else {
			String qxid=request.getParameter("qxidd");
			if(qxid==null||qxid=="") {
				return true;
			}
//			List<Quanxian> list=service.queryAllQuanXian();
			Zhiwei zw=service.queryQuanXianByYuanGongId(yg.getYgid());
			String []a=zw.getQxid().split(",");
			boolean i=false;
			for (String string : a) {
				if(qxid.equals(string)) {
					System.out.println("火火恍恍惚惚哈哈哈");
					i=true;
				}
			}
			
			return i;
			
		}
		
		/**
		 * 是否白名单，不管是否登录都可以看到，loginIn register
		 */
//		request.getRequestURL();
		
		
		/**
		 * 
		 * 登录后才能看到的
		 */
		
	}
}
