package com.basic;

public class Encoding1 {
	
		

		public class MainEncoder {
			static final String s=" ";
		    static final String s1=" ";
		    static final String s2=" ";
			static final String i1;
			final static String i2;
			static String i3;
			static final String j1;
			static String j2;
			static String j3;
			static String k1;
			static String k2;
			static String k3;
			static final int count=1;
			static int count1=1;
			static int count2=1;
		public void Encoder1(String x,String y,String z)
		{
		    show1(x);
		    show1(y);
		    show1(z);
		    show2(x);
		    show2(y);
		    show2(z);
		    show(x);
		    show(y);
		    show(z);
		    
		}
		public void show1(String b) 
		{ 
		        if((b.length()%2)==0)
			     {
			         for(int j=0;j<b.length();j++)
			         {
			             if(count1%2==0)
			             {
			                 s1+=" ";
			                 s1+=b.charAt(j);
			             }
			             else
			             {
			                 s1+=b.charAt(j);
			             }
			             count1++;
			         }
			        System.out.println(s1);
			     	String[] words1=s1.split("\\s");
			     	i1=words1[1];
			     	i2=words1[2];
			     	i3=words1[3];
		         }
		   	}
		public static void show2(String c)
		{
			    if(((c.length()-2)%3)==0)
			     {  
			         for(int k=0;k<c.length();k++)
			         {
			             if(count2%3==0)
			             {
			            	 s2+=" ";
			                 s2+=c.charAt(k);
			                 s2+=" ";
			             }
			             else
			             {
			                 s2+=c.charAt(k);
			             }
			             count2++;
			         }
			        System.out.println(s2);
			     	String[] words2=s2.split("\\s");
			     	j1=words2[1];
			     	j2=words2[2];
			     	j3=words2[3];
		        }
		   }
		public static void show(String a)
		{
			    if((a.length()%3)==0)
			    {
			    for(int i=0;i<a.length();i++)
			    {
			    if(count%3==0)
			    {
			    s+=a.charAt(i);
			    s+=" ";
			    }
			    else
			    {
			    s+=a.charAt(i);
			    }
			    count++;
			    }
			    System.out.println(s);
			     	String words[]=s.split("\\s");
			     	k1=words[1];
			     	k2=words[2];
			     	k3=words[3];
			    }
		}
		public static void main(String[] args) {
		MainEncoder1 m=new MainEncoder1();
		m.Encoder1("John","Johny","Jarardhan");
		String output1=i1+j2+k3;
		String output2=i2+


		}}}


