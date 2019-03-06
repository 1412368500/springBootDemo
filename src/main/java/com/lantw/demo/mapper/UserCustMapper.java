package com.lantw.demo.mapper;

import com.lantw.demo.model.User;

import java.util.List;

public interface UserCustMapper extends UserMapper{

    List<User> selectBy(User user);
}