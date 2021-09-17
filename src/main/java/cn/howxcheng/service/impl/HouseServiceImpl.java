package cn.howxcheng.service.impl;

import cn.howxcheng.dao.HouseDao;
import cn.howxcheng.pojo.House;
import cn.howxcheng.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    HouseDao houseDao;

    @Override
    public List<House> getHouseInfo(String hid, String address, String rent, String maxRent, String size, String maxSize, boolean admin) {
        return houseDao.getHouseInfo(hid, address, rent, maxRent, size, maxSize, admin);
    }

    @Override
    public int deleteHouseInfo(String hid) {
        return houseDao.deleteHouseInfo(hid);
    }
}
