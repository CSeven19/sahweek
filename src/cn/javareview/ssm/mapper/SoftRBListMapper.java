package cn.javareview.ssm.mapper;

import java.util.List;

import cn.javareview.ssm.po.SoftRBList;
import cn.javareview.ssm.po.SoftRBListQueryVo;

public interface SoftRBListMapper {
	public List<SoftRBList> selectAllList()throws Exception;
	
	public SoftRBList selectSkillListById(Integer BRid)throws Exception;
}
