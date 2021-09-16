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
        else if (!address.equals("")){
            address = "%%" + address +"%%";
        }
        String rent = jsonString.get("rent");
        String maxRent = "";
        if (rent == null)
            rent = "";
        else if(!rent.equals("")){
             maxRent = String.valueOf(Integer.parseInt(rent) + 250);
        }
        String size = jsonString.get("size");
        String maxSize = "";
        if (size == null)
            size = "";
        else if(!size.equals("")){
            maxSize = String.valueOf(Integer.parseInt(size)+20);
        }
        boolean adminFlag = false;
        String admin = jsonString.get("admin");
        if (admin != null && admin.equals("ioonv8ExxUxIzorh"))
            adminFlag = true;
        return houseService.getHouseInfo(hid, address, rent,maxRent, size,maxSize, adminFlag);
    }
}
