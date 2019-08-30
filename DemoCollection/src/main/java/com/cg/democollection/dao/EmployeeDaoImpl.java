package com.cg.democollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.democollection.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee<Integer,Double>> myList=new ArrayList<Employee<Integer,Double>>();
public Employee<Integer,Double> addEmployee(Employee<Integer,Double> emp)
{
	myList.add(emp);
	return emp;
}
public List<Employee<Integer,Double>> showEmployee()
{
	return myList;
}
}
