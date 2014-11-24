package com.l.springinpractice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author L-win8 
 * 2014年11月24日 -- 下午9:10:20
 *
 * 1.用户登录
 * 2.用户注销 
 * 3. 
 */
@Controller
@RequestMapping("/accessor")
public class AccessorController {
	
	
	public String login() {
		return "accessor/login";
	}
	
	public String logout() {
		return "accessor/logout";
	}
	
}
