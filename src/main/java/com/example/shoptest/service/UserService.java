package com.example.shoptest.service;

import com.example.shoptest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 通过用心姓名查找用户
     * @param name
     * @return
     */
    public List<User> findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    /**
     * 通过用户信息插入用户   并返回插入的用户
     * @param user
     * @return
     */
    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }


    /**
     * 查询所有的用户
     * @return
     */
    public List<User> ListUser(){
        return userMapper.ListUser();
    }

    /**
     * 借助用户信息更新用户表
     * @param user
     * @return
     */
    public int Update(User user){
        return userMapper.Update(user);
    }

    /**
     * 借助id删除用户信息
     * @param id
     * @return
     */
    public int delete(int id){
        return userMapper.delete(id);
    }

}
