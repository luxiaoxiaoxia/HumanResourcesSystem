package com.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	//@Autowired
	//private EmployeeService employeeService;
	
	@RequestMapping("/toAddEmployee")
	public String toAddOrder(Model model) {
		
		return "addEmployee";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(String eLastName,String eEmail,String eBirth,String eDept) {
		
		return "redirect:/employee/findAllEmployee";
	}
	
	@RequestMapping("/findAllEmployee")
	public String findAllEmployee(Model model) {
		
		return "allEmployee";
	}
	
	@RequestMapping("/deleteEmployee")
	@ResponseBody
	public String deleteEmployee(Integer eId) {
		
		String data = "0";
		
		return data;
	}
	
	

}