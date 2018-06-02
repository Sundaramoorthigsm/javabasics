package com.basic;

public class Student extends Object {
private int id;
private String Fname;
private String Lname;
private String gender;
private String branch;
private String dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", gender=" + gender + ", branch=" + branch
			+ ", dept=" + dept + "]";
}





}
