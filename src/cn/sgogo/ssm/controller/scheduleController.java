package cn.sgogo.ssm.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import cn.sgogo.ssm.po.Schedule;
import cn.sgogo.ssm.service.ScheduleService;

@Controller
@RequestMapping(value="/schedule",produces = "application/json; charset=utf-8")
public class scheduleController {
	int							loop;
	FileInputStream				fis							= null;
	InputStreamReader			isr							= null;
	BufferedReader				br							= null;
	String						scharcode					= "utf-8";
	String						line						= null;
	//SevenWarning 一定要添加注解，不然spring无法识别
	@Autowired
	private ScheduleService scheduleService;
	
	//注解的映射
	@RequestMapping(value="/updateLearnrecords",produces = "application/json; charset=utf-8")
	public void updatelearnrecords(@RequestParam("file") MultipartFile file, HttpServletRequest request,HttpServletResponse response){
		String filePath = null;
		//上传文件读取
		try{
			//判断文件是否为空
	        if (!file.isEmpty()) {
                // 文件保存路径
                filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
                        + file.getOriginalFilename();
                //SevenLE 转存文件,通过转存文件，将格式未MultipartFile转换成标准类型File
                file.transferTo(new File(filePath));
	        }
			fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis, scharcode);
			br  = new BufferedReader(isr);
			loop = 0;
			while ((line = br.readLine()) != null) {
				Schedule schedule = new Schedule();
				line = line.trim();
				String[] sarray=line.split(";");
				switch (sarray.length){
					case 3:
						//最普遍的情况     2017/09/18;android0.5;C
						schedule.setLogindate(sarray[0]);
						schedule.setContent(sarray[1]);
						schedule.setLevel(sarray[2]);
						break;
					case 4:
						schedule.setLogindate(sarray[0]);
						schedule.setContent(sarray[1]);
						schedule.setLevel(sarray[2]);
						schedule.setCompleted(sarray[3]);
						schedule.setCompleteddate(sarray[0]);
						break;
				}
				try {
					scheduleService.insertlearnrecord(schedule);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(schedule!=null){
						schedule=null;
					}
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null)
					fis.close();
				if(isr!=null)
					isr.close();
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//注解的映射
	@RequestMapping(value="/showSheduleList",produces = "application/json; charset=utf-8")
    @ResponseBody
	public String showshedulelist(HttpServletRequest request,HttpServletResponse response){
//		PrintWriter				pw						= null;
		String					strjson					= null;
		try {
			List<Schedule> schedules = scheduleService.showshedulelist();
//			pw = response.getWriter();
			Gson delgson = new Gson();
			strjson = delgson.toJson(schedules);
			response.setContentType("application/json; charset=UTF-8");
//			response.setContentType("text/javascript;charset=utf-8"); //当然如果是json数据,需要设置为("text/javascript;charset=utf-8");
//			response.setCharacterEncoding("utf-8");
//			pw.write(strjson);
//			pw.flush();
//			pw.close();
//			pw = null;
			//不能使用pw，框架限制。中文会乱码。
			return strjson;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strjson;
	}
}
