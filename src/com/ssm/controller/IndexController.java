package com.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.Employee;
import com.ssm.entity.User;
import com.ssm.service.EmployeeService;
import com.ssm.service.ResignEmployeeService;
import com.ssm.service.UserService;
import com.ssm.util.MD5Util;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ResignEmployeeService resignEmployeeService;
	
	@RequestMapping("/toRegister")
	public String toAddUser(Model model) {
		return "lar/register";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(Model model) {
		return "lar/login";
	}
	
	@RequestMapping("/register")
	public String register(User user,HttpSession session,Model model) {
		user.setuPassword(MD5Util.md5(user.getuPassword()));
		user.setuType(0);
		user.setuCreateTime(new Date());
		boolean flag = userService.addUser(user);
		User user1 = userService.findUserByUName(user.getuName());
		if(flag) {
			session.setAttribute("user", user1);
			return "user/userIndex";
		}else {
			model.addAttribute("registerMsg", "×¢²áÊ§°ÜÇëÖØÐÂ×¢²á");
			return "lar/register";
		}
	}
	
	@RequestMapping("/login")
	public String login(String name,String password,HttpSession session,Model model) {
		User user = userService.findUserByUNameAndUPassword(name, MD5Util.md5(password));
		Employee employee = employeeService.findEmployeeByENameAndEPassword(name, MD5Util.md5(password));
		if(user == null && employee != null) {
			session.setAttribute("employee", employee);
			switch (employee.geteType()) {
			case 1:
				return "employee/employeeIndex";
			case 2:
				return "dmanager/dmanagerIndex";
			case 3:
				return "manager/managerIndex";
			}
		}else if(user != null && employee == null) {
			session.setAttribute("user", user);
			return "user/userIndex";
		}else {
			model.addAttribute("loginMsg", "µÇÂ¼Ê§°Ü");
			return "lar/login";
		}
		return "lar/login";
	}
	
	@RequestMapping("/checkRegisterUNameAndUPassword")
	@ResponseBody
	public String checkRegisterUNameAndUPassword(String uName,String uPassword) {
		String data = "1";
		System.out.println(uName);
		System.out.println(uPassword);
		if(uPassword == null||uPassword.length() < 6) {
			data = "0";
		}else {
			if(userService.findUserByUName(uName)==null&&employeeService.findEmployeeByEName(uName)==null&&resignEmployeeService.findResignEmployeeByReName(uName)==null) {
				data = "1";
			}else {
				data = "-1";
			}
		}
		return data;
	}
	
	@RequestMapping("/checkLoginNameAndPassword")
	@ResponseBody
	public String checkLoginUNameAndUPassword(String name,String password) {
		String data = "1";
		if(password == null||password.length() < 6) {
			data = "0";
		}else {
			if(userService.findUserByUName(name)==null&&employeeService.findEmployeeByEName(name)==null) {
				data = "-1";
			}else if(userService.findUserByUNameAndUPassword(name, MD5Util.md5(password))==null&&employeeService.findEmployeeByENameAndEPassword(name, MD5Util.md5(password))==null){
				data = "-2";
			}else {
				data = "1";
			}
		}
		return data;
	}
	
	

}