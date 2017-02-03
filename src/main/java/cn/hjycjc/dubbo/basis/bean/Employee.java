package cn.hjycjc.dubbo.basis.bean;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1475403505631117429L;

	
	private String employeeId;
	
	private String employeeName;
	
	private  Integer employeeAge;
	
	private String employeeEmial;
	
	private String employeeTel;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String employeeName, Integer employeeAge, String employeeEmial,
			String employeeTel) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeEmial = employeeEmial;
		this.employeeTel = employeeTel;
	}



	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeEmial() {
		return employeeEmial;
	}

	public void setEmployeeEmial(String employeeEmial) {
		this.employeeEmial = employeeEmial;
	}

	public String getEmployeeTel() {
		return employeeTel;
	}

	public void setEmployeeTel(String employeeTel) {
		this.employeeTel = employeeTel;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeeEmial=" + employeeEmial + ", employeeTel=" + employeeTel + "]";
	}
}
