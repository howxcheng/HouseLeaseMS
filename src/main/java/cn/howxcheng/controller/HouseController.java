package cn.howxcheng.controller;

import cn.howxcheng.pojo.House;
import cn.howxcheng.service.HouseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class HouseController {
    @Resource
    HouseService houseService;

    @PostMapping("/getHouseInfo")
    public List<House> getHouseInfo(@RequestBody Map<String, String> jsonString) {
        String hid = jsonString.get("hid");
        if (hid == null)
            hid = "";
        String address = jsonString.get("address");
        if (address == null)
            address = "";
        String rent = jsonString.get("rent");
        if (rent == null)
            rent = "";
        String size = jsonString.get("size");
        if (size == null)
            size = "";
        boolean adminFlag = false;
        String admin = jsonString.get("admin");
        if (admin != null && admin.equals("ioonv8ExxUxIzorh"))
            adminFlag = true;
        return houseService.getHouseInfo(hid, address, rent, size, adminFlag);
    }
}
