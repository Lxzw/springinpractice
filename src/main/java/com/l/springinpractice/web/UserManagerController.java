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
 * 2014��11��24�� -- ����9:06:14
 *
 * 1. �����û���ע�ᣩ���ض���
 * 2. ɾ���û� ���ض���
 * 3. �޸��û�
 * 4. ��ȡ�û��б���ҳ��ʾ��
 * 5. ��ȡ�û���ϸ��Ϣ
 * 6. �����Բ����û���Ϣ
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
