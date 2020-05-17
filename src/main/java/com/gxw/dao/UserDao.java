package com.gxw.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.gxw.enity.User;

import java.util.List;

/**
 * 用户持久层
 * @author GXW工作室
 * @date 2020/5/17 0017 - 11:50
 */
public interface UserDao {
    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据uid查询
     * @param uid
     * @return
     */
    @Select("select * from user where uid = #{uid} ")
    User findById(Integer uid);

    /**
     * 更新用户
     * @param user
     */
    @Update("update user set username=#{username},password=#{password},sex=#{sex},email=#{email} where uid=#{uid}")
    void updateUser(User user);
}
