package cn.javareview.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.javareview.ssm.mapper.SoftRBListMapper;
import cn.javareview.ssm.po.SoftRBList;
import cn.javareview.ssm.service.SkillService;

public class SkillServiceImpl implements SkillService{
	@Autowired
	private SoftRBListMapper softRBListMapper;//接口都要使用@Autowired来使用spring和mybatis的整合包，以使bean直接绑定.
	
	public List<SoftRBList> selectAllList()
			throws Exception {
		//通过softRBListMapper查询数据库
		return softRBListMapper.selectAllList();
	}

	@Override
	public SoftRBList selectSkillListById(Integer BRid) throws Exception {
		// TODO Auto-generated method stub
		return softRBListMapper.selectSkillListById(BRid);
	}
}
