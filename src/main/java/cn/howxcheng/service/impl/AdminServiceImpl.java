package cn.howxcheng.service.impl;

import cn.howxcheng.dao.AdminDao;
import cn.howxcheng.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public int adminLogin(String username, String password) {
        return adminDao.adminLogin(username, password);
    }
}
