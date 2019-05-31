package com.service.service.impl;

import com.service.mapper.userinfo.UserInfoMapper;
import common.entity.UserEntity;
import common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wxs
 * @date 2019/5/30 15:01
 **/
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserEntity> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }
}
