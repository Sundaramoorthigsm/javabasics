package com.basic;
import java.util.*;
public class FirstDuplicate1{

	
	
		
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N=scanner.nextInt();
	int[] arr=new int[N];
	for(int m=0;m<N;m++)
	{
	arr[m]=scanner.nextInt();
	}
	try
	{ 
	int c=0;
	int n=findFirst(arr);
	for(int k=0;k<arr.length;k++)
	{
	if(n==arr[k])
	{
	c++;
	}
	}
	System.out.println(n+" "+c);
	}
	catch(noRepeatException ex)
	{
	System.out.println("no repeat");
	}
	}
	public static int findFirst(int[] arr)throws noRepeatException{
	int l=arr.length;
	for(int i=0;i<l-1;i++)
	{
	for(int j=i+1;j<l;j++)
	{
	if(arr[i]==arr[j])
	{
	return arr[i];
	}
	}
	}
	throw new noRepeatException();
	}
	}
	class noRepeatException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	

	}

	
