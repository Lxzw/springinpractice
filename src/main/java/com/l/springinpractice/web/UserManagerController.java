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

	private List<Customer> users = new ArrayList<Customer>();
	
	public UserManagerController () {
		users.add(new Customer(1,"����","3302832134243242"));
		users.add(new Customer(2,"С��","1232832134243242"));
		users.add(new Customer(3,"С��","2132832134243242"));
		users.add(new Customer(4,"��ķ","2122832134243242"));
	}
	
	@RequestMapping
	public String getUser(@RequestParam("id") Integer id, Model model) {
		model.addAllAttributes(users);
		return "jsp/user/userlist";
	}
}
