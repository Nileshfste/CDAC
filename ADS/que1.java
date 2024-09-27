package org.example;

import java.util.Scanner;
public class que1{
 static public void main(String[] args){
 

Scanner sc =new Scanner(System.in); 
System.out.print("enter the num");
int number = sc.nextInt();
int result =0;
int original_num=number;
while(number!=0)
{
int reminder = number % 10;
result+=reminder*reminder*reminder;
number/=10;

}


if(original_num==result){
	
	 System.out.println("NUMBER IS ARMSTRONG:"+original_num);
}
else
{
	
System.out.println("NUMBER IS NOT ARMSTRONG:"+original_num);
}
sc.close();
 
 }
 
 }
 