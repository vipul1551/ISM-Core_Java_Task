/*
 Insurance Calc 
		An insurance company follows following rules to calculate premium.
		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
		city and is a male then the premium is Rs. 4 per thousand.
		b. If a person satisfies all the above conditions except that the gender is female then the premium is
		Rs. 3 per thousand.
		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
		village and is a male then the premium is Rs. 6 per thousand.
		d. In all other cases the person is not insured.
		Take a person's health, age, city and gender as an input and display the premium as per the rule.
 */

package Task11To20.Task11;
import java.util.Scanner;


public class Insurance {
	
	String health,city,gender;
	int age,choice,value,amount;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
			
			System.out.println("1>Excellent \n2>Poor");
			System.out.println("Enter Choice for Health :");
			choice = sc.nextInt();
			switch(choice) {
				
				case 1:{
					health ="Excellent";
					System.out.println("Your health is "+health);
					break;
				}
				case 2:{
					health ="Poor";
					System.out.println("Your health is "+health);
					break;
				}
				default:{
					System.out.println("Enter valid choice\n");
					input();
					break;
				}
			}
			
			System.out.println("1>City\n2>Village");
			System.out.println("Enter choice for City :");
			choice = sc.nextInt();
			switch(choice) {
			
				case 1:{
					city ="City";
					System.out.println("Your choice is "+city);
					break;
				}
				case 2:{
					city ="Village";
					System.out.println("Your choice is "+city);
					break;
				}
				default:{
					System.out.println("Enter valid choice\n");
					input();
					break;
				}
			
			}
			
			System.out.println("1>Male \n2>Female");
			System.out.println("Enter Gender :");
			choice = sc.nextInt();			
			switch(choice) {
			
			case 1:{
				gender ="Male";
				System.out.println("Your choice is "+gender);
				break;
			}
			case 2:{
				gender ="Female";
				System.out.println("Your choice is "+gender);
				break;
			}
			default:{
				System.out.println("Enter valid choice\n");
				input();
				break;
			}
			
		}
		
		System.out.println("Enter Age :");
		age = sc.nextInt();
		
		System.out.println("Enter number :");
		value = sc.nextInt();
		
	}
	
	public void premium() {
		if(age>25 && age<35) {
			
			if(health=="Excellent" && city=="City") {
				
				if(gender=="Male") {
				
					amount = (value * 4) / 1000;
					System.out.println("Your Premium is Rs."+amount);
				}
				else if(gender=="Female") {
					amount = (value * 3) / 1000;
					System.out.println("Your Premium is Rs."+amount);
				}
				
			}
			
			else if(health=="Poor" && city=="Village") {
				
				if(gender=="Male") {
					
					amount = (value * 6)/1000;
					System.out.println("Your Premium is Rs."+amount);
				}
				
				else {
					
					System.out.println("You are not eligible for Premium");
				}
			}	
			
			else {
				System.out.println("You are not eligible for Premium");
			}
			
		}
		
		else {
			System.out.println("You are not eligible for Premium");
		}
		
	}

	public static void main(String[] args) {
		
		Insurance pi = new Insurance();
		pi.input();
		pi.premium();
	}

}
