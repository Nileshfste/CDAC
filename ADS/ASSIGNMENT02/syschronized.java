package org.example;
class A implements Runnable
{   int avilible=2,passenger;

	public A(int passenger) {

	this.passenger = passenger;
}

	public synchronized void run()
{  
		
		String name=Thread.currentThread().getName();
if(avilible>=passenger) {
	System.out.println(name+"   :-reserved seat");
	avilible=avilible-passenger;
	
}else {
	System.out.println("not avilible");
}
		
}
	
}
public class syschronized {
	

	public static void main(String[] args)  
	{
		A t =new A(1);
	
		
		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		Thread t3= new Thread(t);
		t1.setName("nilesh"); 
		t2.setName("sanam");
		t3.setName("nilu");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
