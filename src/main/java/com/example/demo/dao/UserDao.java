package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.bean.User;;

public interface UserDao{

    /**
     * find
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();
    
    @Select("select * from user where id=#{id}")
    public User findById(int id);
    
    @Insert("insert into user values (#{id}, #{name}, #{password}, #{type})")
    public void add(User user);
    
    @Update({ "update user set name = #{name},password = #{password},type = #{type} where id = #{id}" })
    public void update(User user);
    
    @Delete("delete from user where id = #{id}")
    public void delete(int id);
    
}