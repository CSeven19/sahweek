package cn.javareview.ssm.service;

import java.util.List;

import cn.javareview.ssm.po.SoftRBList;

public interface SkillService {
	public List<SoftRBList> selectAllList() throws Exception;
	
	public SoftRBList selectSkillListById(Integer BRid)throws Exception;
}
