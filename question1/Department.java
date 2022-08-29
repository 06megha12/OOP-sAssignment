package com.oops.question1;

public class Department {
	int Deptid;
	String Dname;
	public int getDeptid() {
		return Deptid;
	}
	public void setDeptid(int deptid) {
		Deptid = deptid;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public Department(int deptid, String dname) {
		super();
		Deptid = deptid;
		Dname = dname;
	}
	@Override
	public String toString() {
		return "Department [Deptid=" + Deptid + ", Dname=" + Dname + "]";
	}
	
	
}
