/*
Telephone Diary 

We need to create one diary app for user.
when user open app it display menu for operation 
e.g

1 Add new Contact
2 Edit Contact
3 Search Contact 
4 Remove Contact 
5 Exit From App 


1 Add contact will add new contact in app. we need to store first name last name and phone number of user. 
2 Edit contact will modify user info.  user can search via firstname once user found then only edit function will work
3 when user want to contact any person user can use this functionality, he can add first name of user and your app will list all users with matching first name 
4  remove contact will remove contact from app user can remove contact via first name , if multiple user found then app need to confirm which user need to be deleted , you have to manage this by your own way 
5 exit :) 
 */

package Task1To10.Task10;
import java.util.Scanner;

public class TelephoneDiary {
	
	String contact;
	String firstName,lastName,remove,search,edit;
	static int count=0;
	static int i=0;
	TelephoneDiary T[] = new TelephoneDiary[100];
	TelephoneDiary tdata[] = new TelephoneDiary[100];
	Scanner sc = new Scanner(System.in);
	
	
	public void input() {
		System.out.print("\nEnter First Name : ");
		firstName = sc.next();
		System.out.print("Enter Last Name : ");
		lastName = sc.next();
		System.out.print("Enter Contact : ");
		contact = sc.next();
		count++;
	}
	

	
	public void print(int i) {
		System.out.println("\nFirst Name : " + tdata[i].firstName + "\nLast Name : " + tdata[i].lastName + "\nContact : " + tdata[i].contact + "\n");
		
	}
	public void printAll() {
		for(int i=0;i<count;i++){
			System.out.println("\nFirst Name : " + tdata[i].firstName + "\nLast Name : " + tdata[i].lastName + "\nContact : " + tdata[i].contact + "\n");
		}
	}
	
	public void editContact(String edit){
		
		for(int i=0;i<count;i++){
			if(edit.equals(tdata[i].firstName)){
				
				print(i);
				System.out.println("\nWhat You want to Edit.\n1>First Name \n2>Last Name \n3>Contact\n");
				System.out.println("Enter your choice : ");
				int editChoice = sc.nextInt();
				
				switch(editChoice){
					case 1:{
						System.out.println("Enter First Name : ");
						String editFirstName = sc.next();
						tdata[i].firstName = editFirstName;
						System.out.println("Edited successfully\n");
						break;
					}
					
					case 2:{
						System.out.println("Enter Last Name : ");
						String editLastName = sc.next();
						tdata[i].lastName = editLastName;
						System.out.println("Edited successfully\n");	
						break;
					}
					
					case 3:{
						System.out.println("Enter Contact : ");
						String editContact = sc.next();
						tdata[i].contact = editContact;
						System.out.println("Edited successfully\n");		
						break;						
					}
					
					default:{
						
					
					}
					
				}
			}
		}
	}
	
	public void searchContact(String search){
		
		for(int i=0;i<count;i++){
			
			
			if(search.equals(tdata[i].firstName)){
				print(i);
			}
		}
		
	}
	
	public void removeContact(String remove){
		
		for(int i=0;i<count;i++){
			if(remove.equals(tdata[i].firstName)){
					
				print(i);
			}
			for(int j=i;j<count-1;j++){
				
				tdata[i].firstName = tdata[i+1].firstName;
				tdata[i].lastName = tdata[i+1].lastName;
				tdata[i].contact = tdata[i+1].contact;
			}
			System.out.println("Contact Deleted Successfully");
			count--;
		}	
	}
	
	

	public void choice() {	
		
		while(true){
			System.out.println("\n1> Add new Contact\n" + "2> Edit Contact\n" + "3> Search Contact \n" + "4> Delete Contact \n" + "5>Show Contacts\n" + "6> Exit From App \n");
			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			
				case 1:{
					tdata[i] = new TelephoneDiary();
					tdata[i].input();
					i++;
					break;
				}
				
				case 2:{
					System.out.println("\nEDIT CONTACT");
					System.out.println("Enter First name : ");
					edit = sc.next();
					editContact(edit);
					break;
				}
				
				case 3:{
					System.out.println("\nSEARCH CONTACT");
					System.out.println("Enter First name : ");
					search = sc.next();
					searchContact(search);
					break;
				}
				
				case 4:{
					System.out.println("\nDELETE CONTACT");
					System.out.println("Enter First name : ");
					remove = sc.next();
					removeContact(remove);
					break;
				}
				
				case 5:{
					System.out.println("\nALL CONTACTS");
					printAll();
					break;
				}
				
				case 6:{
					System.out.println("EXIT DONE");
					System.exit(0);
					break;
				}
				
				default:{
					System.out.println("\nInvalid Choice!");
				}
			}
			
		}
	}

	

	public static void main(String[] args) {
		TelephoneDiary tp = new TelephoneDiary();
		tp.choice();
	}

}