package cn.sgogo.ssm.service;

import java.util.List;

import cn.sgogo.ssm.po.Schedule;

public interface ScheduleService {
	
	//插入学习记录
	public void insertlearnrecord(Schedule schedule) throws Exception;
	//显示schedule一览
	public List<Schedule> showshedulelist() throws Exception;
}
