/*
	 You need to design an api for google LLC.   your api will verify the syntax of email address ,  syntax for email is , 
	it must contains gmail.com at last. 
	The name can have a-z A_Z 0-9
	Between name(tejasshah)  and domain(gmail.com)  it must contains “@”
	If above rule is not followed then InvalidEmailException will throw by your api.   
*/

package Task11To20.Task15;
import java.util.Scanner;

public class GoogleLLC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email : ");
		String s = sc.next();
		try {
			if(s.matches("[a-zA-Z0-9]+@gmail.com")) {
				System.out.println("Valid Email Address");
			}
			else {
				throw new InvalidEmailException("Invalid Email Address");
			}
	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class InvalidEmailException extends Exception{
	public InvalidEmailException(String s) {
	super(s);
	}
}