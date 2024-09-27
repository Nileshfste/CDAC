package org.example;

import java.util.Scanner;

public class que8 {
	

	  
	    public static void main(String[] args) {
	    	Scanner sc =new Scanner(System.in);
	       String string = new String(sc.nextLine());
	       char[] ch =string.toCharArray();
	       for(int i=0;i<ch.length;i++) {
	    	   for(int j=i+1;j<ch.length;j++) {
	    		   if(ch[i]==ch[j]) 
	    		   {
	    			   System.out.print("["+ ch[j]+"]"+"  ");
		    			  
	    		                                }
	    		   
	    	   }
	       }

	       }
	}
