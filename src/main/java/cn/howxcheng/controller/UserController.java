package cn.howxcheng.controller;

import cn.howxcheng.service.UserService;
import cn.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUserInfo() {
        return userService.getAllUserInfo();
    }

    @RequestMapping("/getUserInfo")
    public List<User> getUserInfo(String UID, String userName, String userAddress, String houseNumber) {
        return userService.getUserInfo(UID, userName, userAddress, houseNumber);
    }

    @RequestMapping("/updateBalance")
    public Integer updateBalance(String UID, String balance) {
        return userService.updateBalance(UID, balance);
    }


}
