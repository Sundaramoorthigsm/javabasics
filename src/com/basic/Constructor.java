package com.basic;

public class Constructor {
	public class Over {
		public Over()
		{
			System.out.println("over started");
		}
		public int Over(int a)
		{
			a*=10;
			return a;
		}
		public String Over()
		{
			 String s="Over finished";
			return s;
		}
		public void main(String args[])
		{
			Over k=new Over();
		    int i=k.Over(2);
			System.out.println("number of Over="+i);
			System.out.println(k.Over());
		}
		}
}
