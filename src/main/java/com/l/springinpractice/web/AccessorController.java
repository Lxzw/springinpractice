package com.l.springinpractice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author L-win8 
 * 2014��11��24�� -- ����9:10:20
 *
 * 1.�û���¼
 * 2.�û�ע�� 
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
