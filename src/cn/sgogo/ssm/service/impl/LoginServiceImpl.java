package cn.sgogo.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.sgogo.ssm.mapper.UserMapper;
import cn.sgogo.ssm.po.User;
import cn.sgogo.ssm.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User finduserbyusername(String username) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByUsername(username);
	}
}
