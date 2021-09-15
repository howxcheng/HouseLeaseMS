package cn.howxcheng.controller;

import cn.howxcheng.pojo.User;
import cn.howxcheng.service.UserService;
import com.mysql.jdbc.log.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;
import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);
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

    @PostMapping("/userRegister")
    public int userRegister(@RequestBody Map<String,String> jsonString) {
        logger.error(jsonString);
        String username = jsonString.get("username");
        String password = jsonString.get("password");
        String phone = jsonString.get("phoneNumber");
        String email = jsonString.get("email");
        User user = new User(0,username,password,phone,email);
        return userService.userRegister(user);
    }
}
