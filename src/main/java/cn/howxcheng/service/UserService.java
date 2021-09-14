package cn.howxcheng.service;

import cn.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 获取用户信息
     */
    List<User> getAllUserInfo();

    List<User> getUserInfo(String UID, String userName,String userAddress, String houseNumber);

    Integer updateBalance(String UID, String balance);
}
