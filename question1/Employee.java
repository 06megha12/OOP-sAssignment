package com.oops.question1;

import java.sql.Date;

public class Employee extends Person{
	
	double salary;
	String date_of_joining;
	String base_Location;
	Department deptobj;
	
	
	public Employee() {
		super();		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_Location() {
		return base_Location;
	}
	public void setBase_Location(String base_Location) {
		this.base_Location = base_Location;
	}
	public Department getDeptobj() {
		return deptobj;
	}
	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}
	public Employee(int pid, String pname, String paddress, String dob, double salary, String date_of_joining,
			String base_Location, Department deptobj) {
		super(pid, pname, paddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_Location = base_Location;
		this.deptobj = deptobj;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_Location="
				+ base_Location + ", deptobj=" + deptobj + "]";
	}
	
	
	
}
