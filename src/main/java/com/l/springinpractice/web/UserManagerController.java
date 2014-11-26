package com.l.springinpractice.web;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.l.springinpractice.domain.Customer;

/**
 * 
 * @author L-win8 
 * 2014年11月24日 -- 下午9:06:14
 *
 * 1. 创建用户（注册），重定向
 * 2. 删除用户 ，重定向
 * 3. 修改用户
 * 4. 获取用户列表（分页显示）
 * 5. 获取用户详细信息
 * 6. 按属性查找用户信息
 */
@Controller
@RequestMapping("/user")
public class UserManagerController {

	private List<Customer> users = new ArrayList<Customer>();
	
	public UserManagerController () {
		users.add(new Customer(1,"张三","3302832134243242"));
		users.add(new Customer(2,"小明","1232832134243242"));
		users.add(new Customer(3,"小美","2132832134243242"));
		users.add(new Customer(4,"吉姆","2122832134243242"));
	}
	
	@RequestMapping
	public String getUser(@RequestParam("id") Integer id, Model model) {
		model.addAllAttributes(users);
		return "jsp/user/userlist";
	}
}
