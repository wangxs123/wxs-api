package com.service.mapper.userinfo;

import common.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wxs
 * @date 2019/5/30 15:11
 **/
@Repository
public interface UserInfoMapper {
    /**
     * 获取所有用户信息
     * @return
     */
    List<UserEntity> getAllUserInfo();
}
