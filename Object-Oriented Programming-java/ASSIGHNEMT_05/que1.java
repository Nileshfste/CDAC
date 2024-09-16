package org.example;

import java.util.Scanner;

class bankacount{
	protected String name;
	protected double balance;
	
	
	


	public void deposit(double amount)
	{
		if(amount>=0) 
		{
			this.balance+=amount;
		}else 
		{
			System.out.println("invali amount");
		}

	}
	
	public String getName() {
		return this.name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public double getbalance() {
		return balance;
	}
	
	
		
		
	}


class savingsaccount extends bankacount{
	protected double wlimit=20000;
	
	public void  withdraw_amount(double amount) {
		
		if(amount<=wlimit) {
			
				if(amount<=balance)
				{
					this.balance-=amount;
					System.out.println("amount_ withdrawed");
					System.out.println("Balance:-"+getbalance());
				}else {System.out.println("amount_ withdraw out off limit");
				
				}
				
		}
		
	}
	
	
}

public class que1{
	public static Scanner sc =new Scanner(System.in);
		
	
	public static int menulist() {System.out.println("____________________________________________");
		System.out.println("0.EXIT");
		System.out.println("1.DEPOSIT");
		System.out.println("2.withdraw");
		 System.out.println("____________________________________________");
		int key =sc.nextInt();
	
		return key;
		
	}
	public static void main(String[] args) {
		savingsaccount A =new savingsaccount();
	while(true)	{
	switch (menulist()) {
	case 0:
		 System.exit(0);
		break;
	case 1:
		System.out.print("ENTER THE NAME:");
		 A.setName(sc.nextLine());
		 sc.next();
		 System.out.println("ENTER THE AMOUNT:");
		 A.deposit(sc.nextDouble()); System.out.println("AMOUNT DEPOSIT BY:"+ A.getName());
		 System.out.println("BALANCE AMOUNT:"+ A.getbalance());

		 
		 
		break;
	case 2: 
		System.out.println(" withdraw AMOUNT limit :"+ A.wlimit);
	
		 System.out.print("ENTER THE withdraw AMOUNT:");
		
		 A.withdraw_amount(sc.nextDouble());
		 System.out.println("BALANCE AMOUNT:"+ A.getbalance());
		break;

	default:
		break;
	}
	}
		
	}
}