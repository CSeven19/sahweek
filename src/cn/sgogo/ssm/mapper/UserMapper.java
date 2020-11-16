package cn.sgogo.ssm.mapper;

import cn.sgogo.ssm.po.User;

public interface UserMapper {
    User selectByUsername(String username);
}