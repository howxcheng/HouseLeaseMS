package cn.howxcheng.service.impl;

import cn.howxcheng.dao.UserDao;
import cn.howxcheng.pojo.User;
import cn.howxcheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int userLogin(String username, String password) {
        return userDao.userLogin(username, password);
    }

    @Override
    public int userRegister(User user) {
        return userDao.userRegister(0, user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail());
    }
}
