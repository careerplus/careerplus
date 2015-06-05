package com.cloudvalley.soaframework.basecomponent.department.service;

import java.util.List;

import com.cloudvalley.soaframework.basecomponent.department.bean.DepartmentBean;

public interface IDepartmentService {

	List<DepartmentBean> doGetDepartmentList();
	
}
