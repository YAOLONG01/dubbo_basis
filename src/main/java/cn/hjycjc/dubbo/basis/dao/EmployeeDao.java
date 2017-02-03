package cn.hjycjc.dubbo.basis.dao;

import cn.hjycjc.dubbo.basis.bean.Employee;

public interface EmployeeDao {
	
	public Employee getForId(String employeeId);
	
	public void create(Employee employee);
	
	public void update(String employeeId,Employee employee);
	
	public void delete(String employeeId);

}
