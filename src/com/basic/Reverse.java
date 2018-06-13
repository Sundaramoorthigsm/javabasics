package com.basic;

public class Reverse {
	
		int a[]= {3,4,5,2,33,24,2};
		public void func()
		{  
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		}
		public static void main(String args[])
		{
			Reverse r=new Reverse();
			r.func();
		}
	}

