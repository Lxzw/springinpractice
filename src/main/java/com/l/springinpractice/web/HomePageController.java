package com.l.springinpractice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.l.springinpractice.domain.Account;

/**
 * 
 * @author L-win8 
 * 2014��11��24�� -- ����8:08:42
 *
 * 1. �����û���¼ҳ��
 * 2. ���ز˵�ҳ��
 * 3. 
 */

@Controller
public class HomePageController {
	
	Account account = new Account();
	
	@RequestMapping({"/","index","index.html","index.htm"})
	public ModelAndView index() {
		return new ModelAndView("index").addObject(account);
	}
	
	@RequestMapping(value={"/","index"},method=RequestMethod.POST)
	public String login(Account account) {
		
		if (account.getUsername().trim().equals("jack")
				&& account.getPassword().equals("123456")) {
			
			return "welcome";
		} else {
			
			return "error";
		}
		
	}
}
