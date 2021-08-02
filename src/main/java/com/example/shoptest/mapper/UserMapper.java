package com.example.shoptest.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    //通过姓名查找用户
    List<User> findUserByName(String name);

    //查询所有的用户信息
    public List<User> ListUser();

    //插入一条用户信心  返回数字表示是否成功
    public int insertUser(User user);

    //通过id删除用户信息
    public int delete(int id);

    //更新用户信息
    public int Update(User user);

}
