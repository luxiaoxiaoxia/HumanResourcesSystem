package com.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
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
import com.ssm.entity.RecruitmentMessage;
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
	
	@RequestMapping("/toUpdateDepartment")
	public String toUpdateDepartment(Model model,Integer dId) {
		Department department = managerService.findDepartmentByDId(dId);
		model.addAttribute("department", department);
		return "manager/departmentUpdate";
	}
	
	@RequestMapping("/updateDepartment")
	public String updateDepartment(Model model,Integer dId,String dName) {
		Department department = managerService.findDepartmentByDId(dId);
		department.setdName(dName);
		boolean flag = managerService.updateDepartment(department);
		if(flag) {
			return "manager/managerIndex";
		}
		model.addAttribute("department", department);
		return "manager/departmentUpdate";
	}
	
	@RequestMapping(value="deleteDepartment",produces="application/json;charset=utf-8")
	@ResponseBody
	public String deleteDepartment(Integer dId) {
		List<Employee> eList = managerService.findEmployeeByDId(dId);
		List<Position> pList = managerService.findPositionByDId(dId);
		if(eList.size()!=0||pList.size()!=0) {
			return "0";
		}else {
			managerService.deleteDepartment(dId);
			return "1";
		}
		
	}
	
	@RequestMapping(value="findEmployeeByPId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findEmployeeByPId(Integer pId) {
		List<Employee> eList = managerService.findEmployeeByPId(pId);
		System.out.println(eList);
		String data = JSON.toJSONString(eList);
		return data;
	}
	
	@RequestMapping("/toUpdatePosition")
	public String toUpdatePosition(Model model,Integer pId) {
		Position position = managerService.findPositionByPId(pId);
		List<Department> dList = managerService.findAllDepartment();
		model.addAttribute("position", position);
		model.addAttribute("dList", dList);
		return "manager/positionUpdate";
	}
	
	@RequestMapping("/updatePosition")
	public String updatePosition(Model model,Integer pId,String pName,Integer dId) {
		List<Department> dList = managerService.findAllDepartment();
		Department department = managerService.findDepartmentByDId(dId);
		Position position = managerService.findPositionByPId(pId);
		position.setpDepartment(department);
		position.setpName(pName);
		boolean flag = managerService.updatePosition(position);
		if(flag) {
			return "manager/managerIndex";
		}
		model.addAttribute("position", position);
		model.addAttribute("dList", dList);
		return "manager/positionUpdate";
	}
	
	@RequestMapping(value="deletePosition",produces="application/json;charset=utf-8")
	@ResponseBody
	public String deletePosition(Integer pId) {
		List<Employee> eList = managerService.findEmployeeByPId(pId);
		if(eList.size()!=0) {
			return "0";
		}else {
			managerService.deletePosition(pId);
			return "1";
		}
		
	}
	
	@RequestMapping(value="findEmployeeByEId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findEmployeeByEId(Integer eId) {
		Employee employee = managerService.findEmployeeByEId(eId);
		String data = JSON.toJSONString(employee);
		return data;
	}
	
	@RequestMapping("/toUpdateEmployee")
	public String toUpdateEmployee(Model model,Integer eId) {
		Employee employee = managerService.findEmployeeByEId(eId);
		List<Position> pList = managerService.findAllPosition();
		List<Department> dList = managerService.findAllDepartment();
		model.addAttribute("employee", employee);
		model.addAttribute("pList", pList);
		model.addAttribute("dList", dList);
		return "manager/employeeUpdate";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(Model model,Employee employee,Integer eDId,Integer ePId) {
		System.out.println(eDId);
		System.out.println(ePId);
		Employee e = managerService.findEmployeeByEId(employee.geteId());
		Department department = managerService.findDepartmentByDId(eDId);
		Position position = managerService.findPositionByPId(ePId);
		System.out.println(employee);
		System.out.println(e);
		System.out.println(department);
		System.out.println(position);
		List<Position> pList = managerService.findAllPosition();
		List<Department> dList = managerService.findAllDepartment();
		employee.seteEntryDate(e.geteEntryDate());
		employee.seteType(position.getpType());
		employee.seteDepartment(department);
		employee.setePosition(position);
		employee.seteRemark(e.geteRemark());
		boolean flag = managerService.updateEmployee(employee);
		if(flag) {
			return "manager/managerIndex";
		}
		model.addAttribute("employee", e);
		model.addAttribute("pList", pList);
		model.addAttribute("dList", dList);
		return "manager/employeeUpdate";
	}
	
	@RequestMapping(value="deleteEmployee",produces="application/json;charset=utf-8")
	@ResponseBody
	public String deleteEmployee(Integer eId) {
		boolean flag = managerService.deleteEmployee(eId);
		String data = "0";
		if(flag) {
			data = "1";
		}
		return data;
	}
	
	@RequestMapping("/toAddRecruitmentMessage")
	public String toAddRecruitmentMessage(Model model) {
		List<Department> dList = managerService.findAllDepartment();
		model.addAttribute("dList", dList);
		return "manager/recruitmentMessageAdd";
	}
	
	@RequestMapping(value="rmFindPositionByRmDId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String rmFindPositionByRmDId(Integer rmDId) {
		System.out.println(rmDId);
		List<Position> pList = managerService.findPositionByDId(rmDId);
		String data = JSON.toJSONString(pList);
		return data;
	}
	
	@RequestMapping(value="checkRMRmDIdAndRmPId",produces="application/json;charset=utf-8")
	@ResponseBody
	public String checkRMRmDIdAndRmPId(Integer rmDId,Integer rmPId) {
		RecruitmentMessage rm = managerService.findRecruitmentMessageByDIdAndPId(rmDId, rmPId);
		String data = "0";
		if(rm == null) {
			data = "1";
		}
		return data;
	}
	
	@RequestMapping("/addRecruitmentMessage")
	public String addRecruitmentMessage(Model model,Integer rmDId,Integer rmPId,String rmMessage) {
		System.out.println("addRecruitmentMessage");
		System.out.println(rmDId);
		System.out.println(rmPId);
		System.out.println(rmMessage);
		RecruitmentMessage rm = managerService.findRecruitmentMessageByDIdAndPId(rmDId, rmPId);
		System.out.println(rm);
		if(rm == null) {
			Department dept = managerService.findDepartmentByDId(rmDId);
			Position posit = managerService.findPositionByPId(rmPId);
			RecruitmentMessage rmNew = new RecruitmentMessage(-1, dept, posit, rmMessage, new Date(), 1);
			System.out.println(rmNew);
			boolean flag = managerService.addRecruitmentMessage(rmNew);
			System.out.println(flag);
			if(flag) {
				return "manager/managerSuccess";
			}
		}
		return "manager/managerDefault";
	}
	
	@RequestMapping("/managerSD")
	public String managerSD() {
		return "manager/managerIndex";
	}
	
	@RequestMapping(value="addDepartment",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addDepartment(String dName) {
		Department department = new Department(-1, dName, new Date(), 1);
		boolean flag = managerService.addDepartment(department);
		String data = "0";
		if(flag) {
			data = "1";
		}
		return data;
	}
	
	@RequestMapping("/toAddPosition")
	public String toAddPosition(Model model,Integer dId) {
		Department department = managerService.findDepartmentByDId(dId);
		model.addAttribute("department", department);
		return "manager/positionAdd";
	}
	
	@RequestMapping("/addPosition")
	public String addPosition(Model model,String pName,Integer dId,Integer pType,Integer pBaseSalary) {
		Department department = managerService.findDepartmentByDId(dId);
		Position position = new Position(-1, pName, new Date(), pType, department, pBaseSalary);
		boolean flag = managerService.addPosition(position);
		if(flag) {
			return "manager/managerIndex";
		}
		model.addAttribute("department", department);
		return "manager/positionAdd";
	}
	
	@RequestMapping("/findAllRecruitmentMessage")
	public String findAllRecruitmentMessage(Model model) {
		List<RecruitmentMessage> rmList = managerService.findAllRecruitmentMessage();
		model.addAttribute("rmList", rmList);
		return "manager/managerIndex";
	}

}
