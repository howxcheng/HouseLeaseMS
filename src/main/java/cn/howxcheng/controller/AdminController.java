package cn.howxcheng.controller;

import cn.howxcheng.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class AdminController {
    @Resource
    AdminService adminService;

    @PostMapping("/adminLogin")
    public int adminLogin(@RequestBody Map<String, String> jsonString, HttpSession httpSession) {
        String username = jsonString.get("username");
        String password = jsonString.get("password");
        if (username == null || password == null) {
            return 0;
        } else if (username.equals("") || password.equals("")) {
            return 0;
        } else {
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("secret_key", "ioonv8ExxUxIzorh");
            return adminService.adminLogin(username, password);
        }
    }

    @PostMapping("/isAdminLogin")
    public String isLogin(HttpSession httpSession) {
        Object keySession = httpSession.getAttribute("secret_key");
        if (keySession != null) {
            String key = keySession.toString();
            if (key.equals("ioonv8ExxUxIzorh")) {
                return httpSession.getAttribute("username").toString();
            }
        }
        return "noLogin";
    }

    @PostMapping("adminLogout")
    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }
}
