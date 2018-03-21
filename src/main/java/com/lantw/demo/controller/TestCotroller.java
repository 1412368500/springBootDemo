package com.lantw.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lantw.demo.service.UserService;

@RestController
public class TestCotroller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public Object home() {
//		return "241412";
		return userService.selectByPrimaryKey(1l);
    }
}
