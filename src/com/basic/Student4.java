package com.basic;

public class Student4 {
	  
	     int rollno;  
	     String name;  
	     static String college = "\nKSR";  
	       
	     static void change(){  
	     college = "KSR";  
	     }  
	  
	     Student4(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    Student4.change();  
	  
	    Student4 s1 = new Student4 (7316,"Sundar");  
	    Student4 s2 = new Student4 (7315,"Ram");  
	    Student4 s3 = new Student4 (7314,"Saran");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

