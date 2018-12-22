package com.lantw.demo.controller;

import com.lantw.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lantw.demo.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestCotroller {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/list")
	public ModelAndView listUser(Model model) {
		List<User> userList = new ArrayList<>();
        userList.add(userService.selectByPrimaryKey(1l));

		model.addAttribute("users", userList);
		return new ModelAndView("/user/list","model",model);
	}
}
