package com.cloudvalley.soaframework.basecomponent.department.dao;

import java.util.List;

import com.cloudvalley.soaframework.basecomponent.department.bean.DepartmentBean;

public interface DepartmentDao {

	List<DepartmentBean> doGetDepartmentList();
	
}
