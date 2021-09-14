package cn.howxcheng.service.impl;

import cn.howxcheng.dao.UserDao;
import cn.howxcheng.service.UserService;
import cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUserInfo() {
        return userDao.getAllUserInfo();
    }

    @Override
    public List<User> getUserInfo(String UID, String userName, String userAddress, String houseNumber) {
        if (UID.equals("")) {
            UID = null;
        }
        if (userName.equals("")) {
            userName = null;
        }
        if (houseNumber.equals("")) {
            houseNumber = null;
        }
        if (userAddress.equals("")) {
            userAddress = null;
        }
        return userDao.getUserInfo(UID, userName, userAddress, houseNumber);
    }

    @Override
    public Integer updateBalance(String UID, String balance) {
        Integer UIDParam = UID.equals("") ? null : Integer.parseInt(UID);
        Float balanceParam = balance.equals("") ? null : Float.parseFloat(balance);
        return userDao.updateBalance(UIDParam, balanceParam);
    }
}
