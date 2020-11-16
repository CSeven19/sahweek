package cn.javareview.ssm.controller;

//非注解开发的Handler
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.javareview.ssm.po.Items;

public class ItemsController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		//调用service查询数据库，查询商品列表。先用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		Items items_1 = new Items();
		items_1.setName("IBM笔记本");
		items_1.setPrice(2000.30);
		items_1.setDetail("特价销售中....");
		items_1.setId(1);
		
		itemsList.add(items_1);
		
		//返回ModelAndView
		ModelAndView modelandview = new ModelAndView();
		//相当于request的setAttribut()
		modelandview.addObject("itemsList", itemsList);
		
		//指定视图
		modelandview.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		return modelandview;
	}
}
