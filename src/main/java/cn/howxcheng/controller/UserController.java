package cn.howxcheng.controller;

import cn.howxcheng.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/userLogin")
    public int userLogin(@RequestBody Map<String, String> jsonString) {
        String username = jsonString.get("username");
        String password = jsonString.get("password");
        if (username.equals("") || password.equals("")) {
            return 0;
        } else {
            return userService.userLogin(username, password);
        }
    }
}
