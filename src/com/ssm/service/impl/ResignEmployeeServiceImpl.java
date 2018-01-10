package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ResignEmployeeDao;
import com.ssm.entity.ResignEmployee;
import com.ssm.service.ResignEmployeeService;
@Service("resignEmployee")
public class ResignEmployeeServiceImpl implements ResignEmployeeService{
	
	@Autowired
	private ResignEmployeeDao resignEmployeeDao;

	@Override
	public ResignEmployee findResignEmployeeByReName(String reName) {
		return resignEmployeeDao.queryResignEmployeeByReName(reName);
	}

	@Override
	public boolean addResignEmployee(ResignEmployee resignEmployee) {
		int res = resignEmployeeDao.insertResignEmployee(resignEmployee);
		boolean flag = false;
		if(res > 0) {
			flag = true;
		}
		return flag;
	}

}
