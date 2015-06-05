package com.cloudvalley.soaframework.basecomponent.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cloudvalley.soaframework.basecomponent.emp.bean.EmpBean;
import com.cloudvalley.soaframework.basecomponent.emp.service.IEmpService;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;


public class UserTest {

private IEmpService empService;
	
	@Before
	public void before(){                                                                    
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		empService = (IEmpService) context.getBean("empService");
	}
	
	@Test
	public void addEmp(){
		EmpBean empBean = new EmpBean();
		empBean.setEmpName("xinpeng");
		empBean.setEmpAge("30");
		System.out.println(empService.doInsertEmp(empBean));
	}
}
