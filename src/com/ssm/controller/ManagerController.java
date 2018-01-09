package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Department;
import com.ssm.service.ManagerService;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/findAllDepartment")
	public String findAllDepartment(Model model) {
		List<Department> dList = managerService.findAllDepartment();
		model.addAttribute("dList", dList);
		return "lar/register";
	}

}
