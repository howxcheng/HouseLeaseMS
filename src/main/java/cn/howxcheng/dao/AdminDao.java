package cn.howxcheng.dao;

import cn.howxcheng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    Integer adminLogin(@Param("username") String username, @Param("password") String password);
}
