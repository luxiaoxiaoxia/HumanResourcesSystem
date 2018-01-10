package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;
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
		return "manager/managerIndex";
	}
	
	@RequestMapping(value="findPositionByDId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findPositionByDId(Integer dId) {
		List<Position> pList = managerService.findPositionByDId(dId);
		System.out.println(pList);
		String data = JSON.toJSONString(pList);
		return data;
	}
	
	@RequestMapping(value="findEmployeeByDId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findEmployeeByDId(Integer dId) {
		List<Employee> eList = managerService.findEmployeeByDId(dId);
		System.out.println(eList);
		String data = JSON.toJSONString(eList);
		return data;
	}


}
