package org.example;

import java.util.Scanner;

class Array {
    private int[] arr;
    public static Scanner sc = new Scanner(System.in);
    
  
    public Array(int size) {
        arr = new int[size];
    }
    

    public void setElement(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds!");
        }
    }
    
   
    public int getElement(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            System.out.println("Index out of bounds!");
            return -1; 
        }
    }

    
    public void acceptElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            int value = sc.nextInt();
            setElement(i, value); 
        }
    }

   
    public void printElements() {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(getElement(i) + "    "); 
        }
        System.out.println(); 
    }
}

public class que8 {
    public static void main(String[] args) {
        Array array = new Array(5); 
        
      
        array.acceptElements();
        
        
        array.printElements();
    }
}
 