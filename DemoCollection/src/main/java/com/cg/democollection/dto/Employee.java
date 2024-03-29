package com.cg.democollection.dto;

public class Employee<T,K> {
	T empId;
	String empName;
	K empSalary;
	public Employee()
	{
	}
	public Employee(T empId, String empName, K empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public T getEmpId() {
		return empId;
	}
	public void setEmpId(T empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public K getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	}


