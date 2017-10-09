package com.czw.dao;


import com.czw.dao.provider.UserDynaSqlProvider;
import com.czw.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    @Select("select * from login where loginname = #{loginname} and password = #{password}")
    User selectByLoginnameAndPassword(@Param("loginname") String loginname,
                                      @Param("password") String password);

    @Select("select * from login where loginname = #{loginname}")
    User selectByLoginname(@Param("loginname")String loginname);

    //查询所有用户
    @Select("select * from login")
    List<User> selectAllUser();

    //添加用户
    @Insert("insert into login(loginname,password) values(#{loginname},#{password})")
    void save(@Param("loginname") String loginname, @Param("password") String password);

    //删除用户
    @Delete("delete from login where loginname = #{loginname} ")
    void deleteUserByName(@Param("loginname") String loginname);

    //动态插入用户
    @InsertProvider(type = UserDynaSqlProvider.class,method = "insertUser")
    void insert(User user);

}
