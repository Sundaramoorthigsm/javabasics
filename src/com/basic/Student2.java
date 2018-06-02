package com.basic;

public class Student2
{
		
	
	 int rollno;  
     String name;  
     static String college = "KSR";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student2(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    Student2.change();  
  
    Student2 s1 = new student1 (111,"Karan");  
    Student2 s2 = new Student9 (222,"Aryan");  
    Student2 s3 = new Student9 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  

