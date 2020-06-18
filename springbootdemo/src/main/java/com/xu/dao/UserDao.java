package com.xu.dao;

import com.xu.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UserDao {
    List<User> findAll();
}
