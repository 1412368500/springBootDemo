package com.lantw.demo.service;

import com.lantw.demo.model.User;

import java.util.List;

public interface UserService {

	User selectByPrimaryKey(Long id);

	List<User> selectBy(User user);
}
