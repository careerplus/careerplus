package com.cloudvalley.soaframework.basecomponent.department.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudvalley.soaframework.basecomponent.department.bean.DepartmentBean;
import com.cloudvalley.soaframework.basecomponent.department.dao.DepartmentDao;
import com.cloudvalley.soaframework.basecomponent.department.service.IDepartmentService;


@Service("departmentService")
public class DepartmentService implements IDepartmentService {

	public List<DepartmentBean> doGetDepartmentList() {
		return departmentDao.doGetDepartmentList();
	}

	private DepartmentDao departmentDao;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	@Autowired
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	
}
