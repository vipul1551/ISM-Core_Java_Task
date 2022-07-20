/*
 Ticket Booking System.

Login
Exit 

Login => mobile number 

1.1 	Book Ticket { Gold Silver Diamond -Qty } 
1.2	View Booked Tickets
1.3	Available Tickets 
1.4       Logout

Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
One user can book max 7 Tickets.
Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
User can identified by mobile number. 
 */

package Task1To10.Task5;
import java.util.Scanner;

public class Ticketbook {
	
	int diamond=200,gold=150,silver=100,dQuantity=20,gQuantity=20,sQuantity=20;
	static int mNumber,bookedTickets,counter=0;
	int person[] = {987,123};
	Scanner sc = new Scanner(System.in);
	
	void login() {

		System.out.println("Enter 1 for Login or 2 for Exit : ");		
		int x = sc.nextInt();
			
		if(x==1){
			System.out.println("\nEnter Mobile number : ");		
			mNumber = sc.nextInt();
			boolean num=false;
			for(int i=0;i<person.length;i++){
				if(mNumber==person[i]) {
					System.out.println("Login Successful\n");	
					num=true;		
				}
			}
			choice(num);
		}
		else if(x==2){
			exit();
		}
		else{
			System.out.println("Invalid Input\n");
			login();			
		}
	}
	
	public void choice(boolean num){
			if(num==true){
				int choice=0;
				while(choice!=4){
					System.out.println("1> Book Ticket { Gold Silver Diamond } \n"+ "2> View Booked Tickets \n"+ "3> Available Tickets \n"+ "4> Logout\n");
					System.out.println("Enter your Choice : ");
					Scanner sc = new Scanner(System.in);
					choice = sc.nextInt();
					
				
					
					switch(choice){
						case 1:{
							System.out.println("\n1>Diamond :  Price = Rs." + diamond + "\n\n2>Gold :  Price = Rs."+ gold + "\n\n3>Silver :  Price = Rs." + silver + "\n");
							System.out.println("Enter your Choice for Ticket: ");
							int choiceTicket = sc.nextInt();
							while(choiceTicket>3){
								System.out.println("Invalid Choice");	
								System.out.println("\n1>Diamond :  Price = Rs." + diamond + "\n\n2>Gold :  Price = Rs."+ gold + "\n\n3>Silver :  Price = Rs." + silver + "\n");
								System.out.println("Enter your Choice for Ticket: ");
								choiceTicket = sc.nextInt();
							}
							
							System.out.println("\nEnter Quantity of Ticket: ");
							int quantityTicket = sc.nextInt();
							while(quantityTicket>7){
								System.out.println("You can not Book more than 7 tickets");	
								System.out.println("Enter Quantity of Ticket: ");
								quantityTicket = sc.nextInt();
							}
							int totalAmount;
							if(choiceTicket==1){
								totalAmount = quantityTicket * diamond;
								System.out.println("Total Amount for " + quantityTicket + " Diamond tickets is Rs. " + totalAmount);
							}
							else if(choiceTicket==2){
								totalAmount = quantityTicket * gold;
								System.out.println("Total Amount for " + quantityTicket + " Gold tickets is Rs. " + totalAmount);
							}
							else if(choiceTicket==3){
								totalAmount = quantityTicket * silver;
								System.out.println("\nTotal Amount for " + quantityTicket + " Silver tickets is Rs. " + totalAmount+"\n");
							}
							
							
							System.out.println("To confirm press 1 or to cancel press 2: ");
							int confirmTicket = sc.nextInt();
							while(confirmTicket > 2){
								System.out.println("Invalid choice\n");	
								System.out.println("To confirm press 1 or to cancel press 2: ");
								confirmTicket = sc.nextInt();									
							}
							
							
							if(confirmTicket==1){
								
								if(choiceTicket==1){
									dQuantity = dQuantity-quantityTicket;								
								}
								else if(choiceTicket==2){
									gQuantity = gQuantity-quantityTicket;								
								}
								else if(choiceTicket==3){
									sQuantity = sQuantity-quantityTicket;							
								}
								counter+=quantityTicket;
								System.out.println("\n"+quantityTicket+" Tickets booked successfully\n");
								
							}
							else if(confirmTicket==2){
								System.out.println("Booking cancelled\n");			
							}
							break;
						}
						
						case 2:{
							bookedTickets = counter;
							System.out.println("\nBooked Tickets : " + bookedTickets + "\n");
							break;
						}
						
						case 3:{
							System.out.println("\nAvailabe Tickets : \n" + "Diamond :  " + "Quantity = " + dQuantity + "\n\nGold :  " + "Quantity = " + gQuantity + "\n\nSilver :  " + "Quantity = " + sQuantity + "\n");
							break;
						}
						
						case 4:{
							System.out.println("Logged Out\n");
							login();
							break;
						}
						
						default:{
							System.out.println("Choice is not valid ! Enter your choice again.\n");
							break;
						}
						
					}
				}
			}
		
			if(num==false){
					System.out.println("User Not Found\n");	
					login();
			}
		}
	
	void exit() {
		System.exit(0);
	}
	
	public Ticketbook() {
		login();
			
	}

	
	
	
	
	public static void main(String[] args) {
		
		Ticketbook tb = new Ticketbook();

	}

}
