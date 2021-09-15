package cn.howxcheng.dao;

import cn.howxcheng.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    Integer userLogin(@Param("username") String username, @Param("password") String password);

    Integer userRegister(@Param("uid") int uid,@Param("username") String username, @Param("password") String password, @Param("phone") String phone, @Param("email") String email);
//    Integer userRegister(@Param("newUser") User newUser);
}
