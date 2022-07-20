/*
13)
 	class Levis 
 		name
 		price
 		category 
 		tax 
 		amount    
   	methods 
   		input 
   		print 
   		
   	user can purchase any item from levis . when user purchase they input all the details
   	of item for levis , tax need to calculate automatically. 
   	tax is based on price of levis item. 
   	like, if category is men then tax is 15% 
   	         category is women then tax is 10% 
   	         category is student then tax is 5% 
   	         
   	once all input done print all response. 
   	
   	ex: 
   	input:
   	    name : denim jeans  
   	    price : 1500
   	    category : men 
   	    
   	output : 
   	  denim jeans 	1500	men 225  1725 
   	  
 */

package Task1To10.Task3;
import java.util.Scanner;

public class Levis {

	int price;
	String name,category;
	double amount,tax;
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name , Price and Category : ");
		name = sc.next();
		price = sc.nextInt();
		category = sc.next();
		sc.close();
		double mTax=0.15,wTax=0.10,sTax=0.05;
		
		
		if(category.equals("men")) {
			tax = price * mTax;
			amount = price + (price * mTax);
			
		}
		else if(category.equals("women")) {
			tax = price * wTax;
			amount = price + (price * wTax);			
		}
		else if(category.equals("student")){
			tax = price * sTax;
			amount = price + (price * sTax);
		}
		else {
			System.out.println("Category not found");
		}
		
	}
	void print() {
		if(category.equals("men") || category.equals("women") || category.equals("student")) {
		System.out.println("Name : "+name+"\nPrice : "+price+"\nCategory : "+category+"\nTax :  "+tax+"\nTotal : "+amount);
		}
	}
	public static void main(String[] args) {
		
		Levis lv = new Levis();
		lv.input();
		lv.print();

	}

}
