package common.service;

import common.entity.UserEntity;

import java.util.List;

/**
 * @author wxs
 * @date 2019/5/30 14:58
 **/
public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<UserEntity> getAllUserInfo();
}
