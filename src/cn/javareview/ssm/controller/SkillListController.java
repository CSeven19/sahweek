package cn.javareview.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.javareview.ssm.mapper.UserMapper;
import cn.javareview.ssm.mapper.UserMapperImpl;
import cn.javareview.ssm.po.GetListOfSoftBRListResJson;
import cn.javareview.ssm.po.SoftRBList;
import cn.javareview.ssm.po.SoftRBListQueryVo;
import cn.javareview.ssm.po.User;
import cn.javareview.ssm.service.ItemsService;
import cn.javareview.ssm.service.SkillService;
import cn.javareview.ssm.service.impl.ItemsServiceImpl;
import cn.javareview.ssm.service.impl.SkillServiceImpl;

@Controller
@RequestMapping("/SkillList")
public class SkillListController {
//	private UserMapper userMapper;
//	private UserMapperImpl userMapperImpl;
	
	@Autowired
	private ItemsService itemsService;//emergency:1这里必须是接口2@Autowired引入的org.springframework.beans.factory.annotation.Autowired很关键。这样spring才将bean交给service.
	@Autowired
	private SkillService skillService;
	
		//注解的映射
		@RequestMapping("/jumpSoftRBpane")
		public ModelAndView querySkillList() throws Exception{
			
			//这些用service实例去调用的，都是调用不到的。
//			SkillServiceImpl skillServiceImpl = new SkillServiceImpl();
//			List<SoftRBList> listOfSoftRBList = skillServiceImpl.selectAllList();
//			String softRBList = skillServiceImpl.selectSkillListById();
//			ItemsServiceImpl itemsServiceImpl = new ItemsServiceImpl();
//			Integer user = itemsService.selectByPrimaryKey();
//			User user = new User();
//			user.setId(2);
//			user.setSex("female");
//			user.setUsername("andy");
//			user.setAddress("taiwan");
//			userMapperImpl.insertSelective(user);
			
			
			List<SoftRBList> listOfSoftRBList = skillService.selectAllList();
			//返回ModelAndView
			ModelAndView modelandview = new ModelAndView();
//			modelandview.addObject("ListOfSoftRBList",listOfSoftRBList);
//			modelandview.addObject("SoftRBList",softRBList);
			modelandview.addObject("listOfSoftRBList", listOfSoftRBList);
					
			//指定视图
			modelandview.setViewName("/WEB-INF/jsp/Review_java/softRBpane.jsp");
			return modelandview;
		}
		@RequestMapping("/GraphicPane")
		public ModelAndView graphicSkillList() throws Exception{
			
			ModelAndView modelandview = new ModelAndView();
			modelandview.setViewName("/WEB-INF/jsp/Review_java/graphicPane.jsp");
			return modelandview;
			
		}
		@RequestMapping("/UploadTestPane")
		public ModelAndView UploadTestList() throws Exception{
			
			ModelAndView modelandview = new ModelAndView();
			modelandview.setViewName("/WEB-INF/jsp/Review_java/upload.jsp");
			return modelandview;
			
		}
		@RequestMapping("/ProjectfileAdd")
		public ModelAndView ProjectfileAdd() throws Exception{
			
			
			ModelAndView modelandview = new ModelAndView();
			return modelandview;
			
		}
		
		@RequestMapping("/listOfSoftRBListJson")
		public @ResponseBody GetListOfSoftBRListResJson getListOfSoftRBList(HttpServletRequest request,HttpServletResponse response) throws Exception{
			//数据需要2次封装,再转json
			GetListOfSoftBRListResJson getListOfSoftRBListResJson = new GetListOfSoftBRListResJson();
			List<SoftRBList> listOfSoftRBList = skillService.selectAllList();
			List<Map<String, String>> list= new ArrayList<Map<String, String>>();
			 for (int i = 0; i < listOfSoftRBList.size(); i++) { 
				 Map<String, String>  map= new HashMap<String, String>();
				 SoftRBList SoftRBListObj =listOfSoftRBList.get(i);
				 String BRid = String.valueOf(SoftRBListObj.getBRid());
				 String BR_name = String.valueOf(SoftRBListObj.getBR_name());
				 String BR_difficultLevel = String.valueOf(SoftRBListObj.getBR_difficultLevel());
				 String BR_reviewLevel = String.valueOf(SoftRBListObj.getBR_reviewLevel());
				 String BR_pdf = String.valueOf(SoftRBListObj.getBR_pdf());
				 String BR_note = String.valueOf(SoftRBListObj.getBR_note());
				 String BR_softApplication = String.valueOf(SoftRBListObj.getBR_softApplication());
				 String my_content = String.valueOf(SoftRBListObj.getMy_content());
				 String BR_reviewDuration = String.valueOf(SoftRBListObj.getBR_reviewDuration());
				 map.put("BRid", BRid);
				 map.put("BR_name", BR_name);
				 map.put("BR_difficultLevel", BR_difficultLevel);
				 map.put("BR_reviewLevel", BR_reviewLevel);
				 map.put("BR_pdf", BR_pdf);
				 map.put("BR_note", BR_note);
				 map.put("BR_softApplication", BR_softApplication);
				 map.put("my_content", my_content);
				 map.put("BR_reviewDuration", BR_reviewDuration);
				 list.add(map);
			 } 
			 getListOfSoftRBListResJson.setRows(list);
//			request.getRequestDispatcher("/WEB-INF/jsp/Review_java/skillList.jsp").forward(request,response);
			return getListOfSoftRBListResJson;
		}
		
		@RequestMapping("/SoftRBListJson")
		public @ResponseBody SoftRBList getSoftRBList(HttpServletRequest request,HttpServletResponse response) throws Exception{
			SoftRBList SoftRBList = skillService.selectSkillListById(Integer.parseInt(request.getParameter("BRid")));
//			request.getRequestDispatcher("/WEB-INF/jsp/Review_java/skillList.jsp").forward(request,response);
			return SoftRBList;
		}
}