package org.example;

class InstanceCounter {
    private static int Count = 0;
    
    public InstanceCounter() {
    	Count++;
    }
    
    public static int getInstanceCount() {
        return InstanceCounter.Count;
    }
}

public class que1 {
	public static void main(String[] args) {
		InstanceCounter i= new InstanceCounter();
		InstanceCounter i1 = new InstanceCounter();
		InstanceCounter i3 = new InstanceCounter();

		System.out.println(InstanceCounter.getInstanceCount());	
	}
}

