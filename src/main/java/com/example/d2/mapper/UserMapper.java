package com.example.d2.mapper;

import com.example.d2.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getAll();
}