package cn.howxcheng.dao;

import cn.howxcheng.pojo.House;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseDao {
    List<House> getHouseInfo(@Param("Hid") String hid, @Param("Address") String address, @Param("Rent") String rent, @Param("MaxRent") String maxRent, @Param("Size") String size, @Param("MaxSize") String maxSize, @Param("Admin") boolean admin);

    Integer deleteHouseInfo(@Param("Hid") String hid);
}
