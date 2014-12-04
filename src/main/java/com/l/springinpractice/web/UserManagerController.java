package com.l.springinpractice.web;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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

	
	private Customer customer = new Customer();
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView viewRegisterPage(ModelMap model) {
		return new ModelAndView("user/register").addObject(customer);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String registerPage(Customer customer,MultipartFile image) {
		System.err.println(customer.getName());
		System.err.println(image.getContentType());

		try {
			FileOutputStream fout =  new FileOutputStream(new File("picture.jpg"));	
			fout.write(image.getBytes());
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
	@RequestMapping(value="/file", method=RequestMethod.GET)
	public ModelAndView viewRegisterPageWithFile(ModelMap model) {
		return new ModelAndView("file/upload").addObject(customer);
	}
	
	/**
	 * 下载文件
	 * 
	 *  1. 通常实现下载的方法
	 *  2. 用异步实现下载文件
	 */
	@RequestMapping(value="/file/{name}",method=RequestMethod.GET)
    public ModelAndView download(@PathVariable("name")   
    String fileName, HttpServletRequest request, HttpServletResponse response)   
            throws Exception {   
  
        response.setContentType("text/html;charset=utf-8");   
        request.setCharacterEncoding("UTF-8");   
        java.io.BufferedInputStream bis = null;   
        java.io.BufferedOutputStream bos = null;   
  
        String ctxPath = request.getSession().getServletContext().getRealPath("/");   
        String downLoadPath = ctxPath + fileName;   
        System.err.println(downLoadPath);   
        try {   
            long fileLength = new File(downLoadPath).length();   
            response.setContentType("application/x-msdownload;");   
            response.setHeader("Content-disposition", "attachment; filename="  
                    + new String(fileName.getBytes("utf-8"), "ISO8859-1"));   
            response.setHeader("Content-Length", String.valueOf(fileLength));   
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));   
            bos = new BufferedOutputStream(response.getOutputStream());   
            byte[] buff = new byte[2048];   
            int bytesRead;   
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {   
                bos.write(buff, 0, bytesRead);   
            }   
        } catch (Exception e) {   
            e.printStackTrace();   
        } finally {   
            if (bis != null)   
                bis.close();   
            if (bos != null)   
                bos.close();   
        }   
        return null;   
    }   
}  
