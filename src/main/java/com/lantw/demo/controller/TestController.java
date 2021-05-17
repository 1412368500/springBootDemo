package com.lantw.demo.controller;

import com.lantw.demo.model.User;
import com.lantw.demo.service.UserService;
import com.lantw.demo.util.Result;
import com.lantw.demo.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有程序接口的入口
 */
@RestController
@Api(value="用户数据操作接口Controller")
public class TestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/list")
	@ApiOperation(value="查看用户列表", notes="查看用户列表" ,httpMethod="GET")
	public ModelAndView listUser(Model model) {
		model.addAttribute("users", userService.selectBy(null));
		return new ModelAndView("/user/list","model",model);
	}


	@RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
	@ApiOperation(value="获取用户信息", notes="获取用户信息" ,httpMethod="GET")
	public User get(@PathVariable("id") Long id) {
		return userService.selectByPrimaryKey(id);
	}



    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
	@ApiOperation(value="登录", notes="登录" ,httpMethod="POST")
    public Result<String> login(@RequestBody User user) {
		Assert.notNull(user,"参数不能为空");
		List<User> list = this.userService.selectBy(user);
		if(CollectionUtils.isEmpty(list)){
			return ResultUtil.fail("账号密码错误或者没有登录信息");
		}else{
			return ResultUtil.success("登陆成功！！！您好，"+user.getName());
		}
    }


}
