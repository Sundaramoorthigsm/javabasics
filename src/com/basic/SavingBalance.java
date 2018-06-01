package com.basic;

public class SavingBalance {
	
		public static int annualInterestRate;
		double savingBalance;
		SavingsBalance();
		{
		
		public double Savings(double balance){
			this.savingBalance=balance;
			return savingBalance;
		}
		public void calculateMonthlyInterest() {
			double interst=(savingBalance * (annualInterestRate/100.0))/12;
					this.savingBalance=savingBalance+annualInterestRate;
					
		}
		public static void modifyInterstRate(int newValue) {
			
			annualInterestRate=newValue;
			System.out.println(annualInterestRate);
		}
		public void showBalance() {
			System.out.println("balance"+savingBalance);
		}
		public static void main(String[] args) {
			
			 SavingBalance sb1=new SavingsBalance(2000.0);
			SavingBalance sb2=new SavingsBalance(3000.0);
			sb1.calculateMonthlyInterest();
			sb2.calculateMonthlyInterest();
			sb1.modifyInterstRate(5);
			sb1.showBalance();
			sb2.modifyInterstRate(5);
			sb2.showBalance();
			}

	}
	


