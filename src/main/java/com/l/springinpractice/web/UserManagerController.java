package com.l.springinpractice.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView viewRegisterPage(ModelMap model) {
		Customer customer = new Customer();
		return new ModelAndView("user/register").addObject(customer);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String registerPage(Customer customer,MultipartFile image) {
		System.err.println(customer.getName());
		System.err.println(image.getContentType());
		return "redirect:/";
	}
	
	@RequestMapping(value="/file", method=RequestMethod.GET)
	public ModelAndView viewRegisterPageWithFile(ModelMap model) {
		Customer customer = new Customer();
		return new ModelAndView("file/upload").addObject(customer);
	}
}
