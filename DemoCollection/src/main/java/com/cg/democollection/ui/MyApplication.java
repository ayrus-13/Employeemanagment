package com.cg.democollection.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cg.democollection.dto.Employee;
import com.cg.democollection.service.EmployeeService;
import com.cg.democollection.service.EmployeeServiceImpl;


public class MyApplication {
	public static void main(String[] args)
	{
		int choice;
		List<Employee<Integer,Double>> myList=new ArrayList<Employee<Integer,Double>>();
		EmployeeService service=new EmployeeServiceImpl();
		do
		{
			printDetail();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("enter the id:");
		Integer id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter salary");
		Double salary=sc.nextDouble();
		Employee<Integer,Double> emp=new Employee<Integer,Double>();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(salary);
		myList.add(emp);
		break;
		case 2:
			myList=service.showEmployee();
			for(Employee<Integer,Double> employee:myList)
			{
			System.out.println("employee id is:"+employee.getEmpId());
			System.out.println("employye name is:"+employee.getEmpName());
			System.out.println("employee salary is:"+employee.getEmpSalary());
			}
			break;
		case 3:
			System.out.println(0);
		}
	
		}while(choice!=2);
	}
		
        public static void printDetail()
        {
        	System.out.println("1.Add");
        	System.out.println("2.Show");
        	System.out.println("3.Exit");
        }
        		

	 
		 
	 }



