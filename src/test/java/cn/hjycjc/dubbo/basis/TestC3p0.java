package cn.hjycjc.dubbo.basis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hjycjc.dubbo.basis.bean.Employee;
import cn.hjycjc.dubbo.basis.service.impl.EmployeeServiceImpl;

public class TestC3p0 {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private EmployeeServiceImpl employeeService;
	
	{
		employeeService=ctx.getBean(EmployeeServiceImpl.class);
	}
	/*
	 * 测试c3p0及mybatis;
	 */
	@Test
	public void test(){
	String employeeId ="1001";
	Employee e=	employeeService.getEmployeeforId(employeeId);
	System.out.println("employee："+e.toString());
	}
	//测试成功！

}
