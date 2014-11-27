package com.l.springinpractice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author L-win8 
 * 2014年11月24日 -- 下午8:08:42
 *
 * 1. 加载用户登录页面
 * 2. 加载菜单页面
 * 3. 
 */

@Controller
public class HomePageController {
	
	@RequestMapping({"/","index","index.html","index.htm"})
	public String index() {
		return "index";
	}
}
