package com.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.Employee;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.entity.Resume;
import com.ssm.entity.User;
import com.ssm.service.EmployeeService;
import com.ssm.service.ResignEmployeeService;
import com.ssm.service.UserService;
import com.ssm.util.MD5Util;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ResignEmployeeService resignEmployeeService;
	
	@RequestMapping("/userSD")
	public String userSD() {
		return "user/userIndex";
	}
	
	@RequestMapping("/toAddApplicationMessage")
	public String toAddApplicationMessage(Model model,Integer rmId,HttpSession session) {
		String userMSG = "";
		User user = (User) session.getAttribute("user");
		List<Resume> rList = userService.findResumeByUId(user.getuId());
		Resume resume = userService.findResumeByUIdAndRType(user.getuId(), -1);
		ApplicationMessage am = userService.findApplicationMessageByByAmRmIdAndAmUId(rmId, user.getUId());
		if(rList.size() == 0) {
			userMSG = "请先去填写简历";
			model.addAttribute("userMSG", userMSG);
			return "user/userDefault";
		}else if(am != null){
			userMSG = "已经投过该职位";
			model.addAttribute("userMSG", userMSG);
			return "user/userDefault";
		}else {
			model.addAttribute("resume", resume);
			return "user/amResume";
		}
	}
	
	@RequestMapping("/toAddOrUpdateResume")
	public String toAddOrUpdateResume(Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		Resume resume = userService.findResumeByUIdAndRType(user.getuId(), -1);
		model.addAttribute("resume", resume);
		return "user/resumeAddOrUpdate";
	}
	
	@RequestMapping("/addOrUpdateResume")
	public String addOrUpdateResume(Resume resume,HttpSession session,Model model) {
		User user = (User) session.getAttribute("user");
		resume.setRUser(user);
		resume.setRType(-1);
		resume.setUResumeDate(new Date());
		if(resume.getRId()==null) {
			userService.addResume(resume);
		}else {
			userService.updateResume(resume);
		}
		return "user/userIndex";
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