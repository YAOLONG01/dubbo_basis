package cn.hjycjc.dubbo.basis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hjycjc.dubbo.basis.bean.Employee;
import cn.hjycjc.dubbo.basis.dao.EmployeeDao;
import cn.hjycjc.dubbo.basis.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployeeforId(String employeeId) {
		
		return employeeDao.getForId(employeeId);
	}

}
