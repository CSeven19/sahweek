package cn.sgogo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//注解开发Handler

@Controller
@RequestMapping("/text")
public class textController {
	
	//注解的映射
	@RequestMapping("/jumpText")
	public ModelAndView queryItems() throws Exception{
		//返回ModelAndView
		ModelAndView modelandview = new ModelAndView();	
		//指定视图
		modelandview.setViewName("/WEB-INF/jsp/sgogo/main.jsp");
		return modelandview;
	}
}

