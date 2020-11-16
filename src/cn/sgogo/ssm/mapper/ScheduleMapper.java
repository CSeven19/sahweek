package cn.sgogo.ssm.mapper;

import java.util.List;

import cn.sgogo.ssm.po.Schedule;

public interface ScheduleMapper {
    void insertlearnrecord(Schedule schedule);
    List<Schedule> showshedulelist();
}