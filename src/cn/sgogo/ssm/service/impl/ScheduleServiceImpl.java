package cn.sgogo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.sgogo.ssm.mapper.ScheduleMapper;
import cn.sgogo.ssm.po.Schedule;
import cn.sgogo.ssm.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleMapper scheduleMapper;

	@Override
	public void insertlearnrecord(Schedule schedule) throws Exception {
		// TODO Auto-generated method stub
		scheduleMapper.insertlearnrecord(schedule);
	}

	@Override
	public List<Schedule> showshedulelist() throws Exception {
		return scheduleMapper.showshedulelist();
	}
}
