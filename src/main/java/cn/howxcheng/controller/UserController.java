package cn.howxcheng.controller;

import cn.howxcheng.pojo.User;
import cn.howxcheng.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class UserController {
//    private static Logger logger = Logger.getLogger(UserController.class);
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
//        logger.error(jsonString);
        String username = jsonString.get("username");
        if (username == null){
            username = "" ;
        }
        String password = jsonString.get("password");
        if (password == null){
            password = "" ;
        }
        String phoneNumber = jsonString.get("phoneNumber");
        if (phoneNumber == null){
            phoneNumber = "" ;
        }
        String email = jsonString.get("email");
        if (email == null){
            email = "" ;
        }
        User user = new User(0,username,password,phoneNumber,email);
        return userService.userRegister(user);
    }
}
