package com.basic;

public class Empolyee1 {
	public static void main(String args[])
	{
		Empolyee e1 = new Empolyee();
		e1.setName("sundar");
		e1.setSalary(30000);
		Empolyee e2 = new Empolyee();
		e2.setName("moorthi");
		e2.setSalary(50000);
		double salary = e1.getSalary();
		salary = salary*1.1;
		System.out.println(e1.getsalary());
		e1.setsalary(salary);
		System.out.println(e2.getsalary());
		
		
		
	}

}
