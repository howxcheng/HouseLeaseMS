package cn.howxcheng.dao;

import cn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    List<User> getUserInfo(@Param("UID") String UID, @Param("userName") String userName, @Param("userAddress") String userAddress, @Param("houseNumber") String houseNumber);

    List<User> getAllUserInfo();

    Integer updateBalance(@Param("UID") Integer UID, @Param("balance") Float balance);
}
