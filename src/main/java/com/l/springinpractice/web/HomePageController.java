package com.l.springinpractice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping({"/","index","index.html","index.htm"})
	public String index() {
		return "index";
	}
}
