package cn.howxcheng.service;

import cn.howxcheng.pojo.User;

public interface UserService {
    /**
     * 获取用户信息
     */
    int userLogin(String username, String password);
    int userRegister(User user);
}
