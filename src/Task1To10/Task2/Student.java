/*
 Student 
			-studentId 
			-name 
			-email
			-password 
			
	when any student registered studentId will automatically assign 
	an unique number. 
	name email and password will input by student. 
	
    create two methods 1) input 2) print 
    
    
    111111	ram	ram@gmail.com	ram123 
 */

package Task1To10.Task2;
import java.util.Scanner;

public class Student {
	
	int Id,studentId=100000;
	String name,email,password;
	
	public Student(){
		
		studentId++;
	}
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name , Email and Password : ");
		Id = studentId;
		name = sc.next();
		email = sc.next();
		password = sc.next();
		
		sc.close();
	}
	
	void print() {
		
		System.out.println(studentId+" "+name+" "+name+" "+email+" "+password+" ");
	}
	
	public static void main(String[] args) {	
		
		Student s = new Student();
		s.input();
		s.print();
	}
}
