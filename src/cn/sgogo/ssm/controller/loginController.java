package cn.sgogo.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.sgogo.ssm.po.User;
import cn.sgogo.ssm.service.LoginService;

//注解开发Handler
// control注解开发:@controller+springmvc.xml的<context:component-scan base-package="cn.sgogo.ssm.controller" />
@Controller
@RequestMapping("/login")
public class loginController {
	
	// @Autowired属于spring框架,@Resource属于j2ee减少耦合.
	@Autowired
	private LoginService loginService;
	
	//注解的映射
	@RequestMapping("/jumpLogin")
	public ModelAndView jumpLogin() throws Exception{
		//返回ModelAndView
		ModelAndView modelandview = new ModelAndView();
		//指定视图
		modelandview.setViewName("/WEB-INF/jsp/sgogo/login.jsp");
		return modelandview;
	}
	@RequestMapping("/validateUser")
	public void validateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//validate user
		User userfromdb = loginService.finduserbyusername(request.getParameter("username"));
		if(userfromdb==null){
			//error=10 无此用户
			request.setAttribute("error", 10);
			//内部重定向
			request.getRequestDispatcher("/WEB-INF/jsp/sgogo/login.jsp").forward(request,response);
		}else if(userfromdb.getPassword().equals(request.getParameter("password"))){
			//error=0 验证正确
			request.setAttribute("error", 0);
			request.getRequestDispatcher("/WEB-INF/jsp/sgogo/main.jsp").forward(request,response);
		}else{
			//error=20 用户密码不对
			request.setAttribute("error", 20);
			//内部重定向
			//注意：这种重定向的必须返回void，否则会报错，无adpter。
			request.getRequestDispatcher("/WEB-INF/jsp/sgogo/login.jsp").forward(request,response);
		}
	}
}

