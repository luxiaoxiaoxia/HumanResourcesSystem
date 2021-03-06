package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ApplicationMessageDao;
import com.ssm.dao.DepartmentDao;
import com.ssm.dao.EmployeeDao;
import com.ssm.dao.PositionDao;
import com.ssm.dao.RecruitmentMessageDao;
import com.ssm.entity.ApplicationMessage;
import com.ssm.entity.Department;
import com.ssm.entity.Employee;
import com.ssm.entity.Position;
import com.ssm.entity.RecruitmentMessage;
import com.ssm.service.ManagerService;
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private RecruitmentMessageDao recruitmentMessageDao;
	@Autowired
	private ApplicationMessageDao applicationMessageDao;

	@Override
	public List<Department> findAllDepartment() {
		return departmentDao.queryAllDepartment();
	}

	@Override
	public List<Position> findPositionByDId(Integer dId) {
		return positionDao.queryPositionByDId(dId);
	}

	@Override
	public List<Employee> findEmployeeByPId(Integer pId) {
		return employeeDao.queryEmployeeByEPId(pId);
	}

	@Override
	public List<Employee> findEmployeeByDId(Integer dId) {
		return employeeDao.queryEmployeeByEDId(dId);
	}

	@Override
	public Department findDepartmentByDId(Integer dId) {
		return departmentDao.queryDepartmentByDId(dId);
	}

	@Override
	public boolean updateDepartment(Department department) {
		int res = departmentDao.updateDepartment(department);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean deleteDepartment(Integer dId) {
		int res = departmentDao.deleteDepartment(dId);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Position findPositionByPId(Integer pId) {
		return positionDao.queryPositionByPId(pId);
	}

	@Override
	public boolean updatePosition(Position position) {
		int res = positionDao.updatePosition(position);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean deletePosition(Integer pId) {
		int res = positionDao.deletePosition(pId);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Employee findEmployeeByEId(Integer eId) {
		return employeeDao.queryEmployeeByEId(eId);
	}

	@Override
	public List<Position> findAllPosition() {
		return positionDao.queryAllPosition();
	}
	
	@Override
	public boolean updateEmployee(Employee employee) {
		int res = employeeDao.updateEmployee(employee);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean deleteEmployee(Integer eId) {
		int res = employeeDao.deleteEmployee(eId);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean addDepartment(Department department) {
		int res = departmentDao.insertDepartment(department);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean addPosition(Position position) {
		int res = positionDao.insertPosition(position);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public RecruitmentMessage findRecruitmentMessageByDIdAndPId(Integer dId, Integer pId) {
		return recruitmentMessageDao.queryRecruitmentMessageByRmDIdAndRmPId(dId, pId);
	}

	@Override
	public boolean addRecruitmentMessage(RecruitmentMessage recruitmentMessage) {
		int res = recruitmentMessageDao.insertRecruitmentMessage(recruitmentMessage);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<RecruitmentMessage> findAllRecruitmentMessage() {
		return recruitmentMessageDao.queryAllRecruitmentMessage();
	}

	@Override
	public RecruitmentMessage findRecruitmentMessageByRmId(Integer rmId) {
		return recruitmentMessageDao.queryRecruitmentMessageByRmId(rmId);
	}

	@Override
	public boolean updateRecruitmentMessage(RecruitmentMessage recruitmentMessage) {
		int res = recruitmentMessageDao.updateRecruitmentMessage(recruitmentMessage);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<ApplicationMessage> findApplicationMessageByRmId(Integer rmId) {
		return applicationMessageDao.queryApplicationMessageByAmRmId(rmId);
	}

	@Override
	public boolean deleteRecruitmentMessage(Integer rmId) {
		int res = recruitmentMessageDao.deleteRecruitmentMessage(rmId);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

	

}
