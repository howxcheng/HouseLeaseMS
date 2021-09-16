package cn.howxcheng.service;

import cn.howxcheng.pojo.House;

import java.util.List;

public interface HouseService {
    List<House> getHouseInfo(String hid,String address,String rent,String size,boolean admin);
}
