package cn.howxcheng.service;

import cn.howxcheng.pojo.House;

import java.util.List;

public interface HouseService {
    List<House> getHouseInfo(String hid, String address, String rent, String maxRent, String size, String maxSize, boolean admin);

    int deleteHouseInfo(String hid);
}
