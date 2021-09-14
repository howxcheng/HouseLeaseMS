package cn.howxcheng.dao;

import cn.howxcheng.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    Integer userLogin(@Param("username") String username, @Param("password") String password);
}
