package org.exampleq3;


class Animal {
 protected String name;

 
 public Animal(String name) {
     this.name = name;
 }

 
 public void eat() {
     System.out.println(name + " is eating.");
 }

 
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }

 
 public String getName() {
     return name;
 }
}


class Dog extends Animal {

 
 public Dog(String name) {
     super(name); 
 }

 
 public void bark() {
     System.out.println(name + " is barking.");
 }
}


public class que3 {
 public static void main(String[] args) {

    
     Animal animal = new Animal("Generic Animal");
     animal.eat();
     animal.sleep();

   
     Dog dog = new Dog("Buddy");
     dog.eat();  
     dog.sleep(); 
     dog.bark();  
 }
}

