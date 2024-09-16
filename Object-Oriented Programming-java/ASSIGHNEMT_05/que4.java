package org.exampleq4;

import java.util.Scanner;

class Student {
 
 private String name;
 private int age;
 
 private int studentID;
 private String course;

 
 public Student() {
     this.name = "";
     this.age = 0;
     this.course = "";
     this.studentID = 0;
 }

 public Student(String name, int age, String course, int studentID) {
     this.name = name;
     this.age = age;
     this.course = course;
     this.studentID = studentID;
 }

 
 public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public int getStudentID() {
	return studentID;
}


public void setStudentID(int studentID) {
	this.studentID = studentID;
}

public void accept(Scanner sc) {
	 System.out.println("Enter the name");
    this.setName(sc.nextLine());
     System.out.println("Enter the AGE");
     this.setAge(sc.nextInt());
     System.out.println("Enter the COURSE name");
     this.setCourse(sc.nextLine());
    sc.next();
     System.out.println("Enter the STUDENT ID");
     this.setStudentID(sc.nextInt());
}
public void displayDetails() {
     System.out.println("Student ID: " + studentID);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + this.getCourse());
 }
}


public class que4{
	public static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
     
     Student student1 = new Student();
     student1.accept(sc);
     student1.displayDetails();
 }
}
