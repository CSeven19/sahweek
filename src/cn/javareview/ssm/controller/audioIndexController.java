package cn.javareview.ssm.controller;

//注解开发Handler

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.javareview.ssm.po.UserParams;
import cn.javareview.ssm.util.XMLUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/Index")
public class audioIndexController {
	
		//注解的映射
		@RequestMapping("/audioIndex")
		public ModelAndView queryItems() throws Exception{
			
			//返回ModelAndView
			ModelAndView modelandview = new ModelAndView();
					
			//指定视图
			modelandview.setViewName("/WEB-INF/jsp/Review_java/audioIndex.jsp");
			return modelandview;
		}

		@RequestMapping("/addUserParams")
		public void addUserParamsToXML(HttpServletRequest request,HttpServletResponse response,UserParams userParams) throws Exception{
//方法(1)利用HttpServlet参数绑定
/*			UserParams userParams = new UserParams();
			userParams.setId("1");
			userParams.setBinkan(request.getParameter("binkan"));
			userParams.setBouei(request.getParameter("bouei"));
			userParams.setDankai(request.getParameter("dankai"));
			userParams.setDankainamae(request.getParameter("dankainamae"));
			userParams.setIdou(request.getParameter("idou"));
			userParams.setKaihi(request.getParameter("kaihi"));
			userParams.setKoudou(request.getParameter("koudou"));
			userParams.setKougeki(request.getParameter("kougeki"));
			userParams.setMahoubouei(request.getParameter("mahoubouei"));
			userParams.setMahoukougeki(request.getParameter("mahoukougeki"));
			userParams.setTairixyoku(request.getParameter("tairixyoku"));
			userParams.setTurnpoint(request.getParameter("turnpoint"));
			XMLUtil xmlutil = new XMLUtil();
			xmlutil.java2xml(userParams);*/
			
//方法(2)利用参数绑定中，从前端jsp载入UserParams对象直接应用。注意应用条件
			UserParams userParams2 = userParams;
			userParams2.setId("1");
			XMLUtil xmlutil = new XMLUtil();
			xmlutil.java2xml(userParams2);
			
			request.getRequestDispatcher("/WEB-INF/jsp/Review_java/audioIndex.jsp").forward(request,response);
		}
		@RequestMapping("/getUserParams")
		public UserParams getUserParamsFromXML() throws Exception{
			XMLUtil xmlutil = new XMLUtil();
			UserParams userParams = xmlutil.xml2java();
			ModelAndView modelandview = new ModelAndView();
//			modelandview.addObject("userParams",userParams);
			modelandview.setViewName("/WEB-INF/jsp/Review_java/audioIndex.jsp");
			return userParams;
		}
}