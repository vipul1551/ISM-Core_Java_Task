/*
  Bank App.

Bank provides various service to the user  like deposit money, wid money and customer can check balance. 
Bank have some conditions. 
Customer have to maintain 5000 min balance. 
Customer can perform max 5  transaction and then customer is charged 10 Rs per transaction.
Customer can access bank app via Username/Password. 
Customers have an account number which is generated via random algo. 

Menu
Login
Exit 

	1.1 wid
	1.2 Dep 
	1.3 CheckBal 
	1.4 Logout 
 */

package Task11To20.Task14;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	String username, password;
	Scanner sc = new Scanner(System.in);
	ArrayList<User> list = new ArrayList<User>();

	public void login() {

		System.out.println("Welcome to Login \n");

		System.out.println("Enter Username : ");
		username = sc.next();
		System.out.println("Enter Password : ");
		password = sc.next();
	}

	public void signUp() {

		System.out.println("Welcome to Sign Up \n");
		User u = new User();
		u.setAccountNum((int) (Math.random() * 1000000));
		System.out.println("Enter First Name : ");
		u.setFirstName(sc.next());
		System.out.println("Enter Last Name : ");
		u.setLastName(sc.next());
		System.out.println("Enter Username : ");
		u.setUserName(sc.next());
		System.out.println("Enter Password : ");
		u.setPassword(sc.next());
		
		while (true) {
			System.out.println("Enter Money you want to Deposit : ");
			int b = sc.nextInt();
				if (b < 5000) {
					System.out.println("Plese Deposit minimum 5000 Rs");
				} else {
					u.setBalance(b);
					break;
				}
			}
		
		
		System.out.println("Your Account Number : " + u.getAccountNum());

		list.add(u);

	}

	public void choice() {

		while (true) {

			System.out.println("\n1>Sign Up \n2>Login \n3>Exit");
			int c = sc.nextInt();
			
			switch (c) {
			case 1: {
				signUp();
				break;
			}
			case 2: {
				int count=1;
				int k=1;
				login();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getUserName().equals(username) && list.get(i).getPassword().equals(password)) {
						k=0;
						System.out.println("\nLogin Successfully\n");
						System.out.println("USER :" + list.get(i).getUserName());
						int flag = 1;
						while (flag == 1) {
							System.out.println("1> Check Balance \n2> Withdraw Money \n3> Deposit Money \n4> Exit");
							int x = sc.nextInt();

							switch (x) {

							case 1: {

								System.out.println("Check Balance");
								System.out.println("Your Balance is : " + list.get(i).getBalance());
								break;
							}

							case 2: {

								System.out.println("Withdraw Money");
								System.out.println("Enter amount to Withdraw : ");
								int w = sc.nextInt();
								int wid = list.get(i).getBalance() - w;

								if (wid >= 5000) {
									if(count>5) {
										System.out.println("You will be charged 10 Rs");
										int charge = wid - 10;
										list.get(i).setBalance(charge);
										System.out.println(w + " Rs Withdraw Successfully");
										count++;
										System.out.println("Your Balance is :" + list.get(i).getBalance());
									}else {
										list.get(i).setBalance(wid);
										System.out.println(w + " Rs Withdraw Successfully");
										count++;
										System.out.println("Your Balance is :" + list.get(i).getBalance());

									}

								} else {
									System.out.println("Unable to Withdraw because You have balance less than 5000 Limit");
								}

								break;
							}

							case 3: {

								System.out.println("Deposit Money");
								System.out.println("Enter amount to Deposit : ");
								int d = sc.nextInt();

								int dep = list.get(i).getBalance() + d;
								if (d != 0) {
									if(count>5) {
										System.out.println("You will be charged 10 Rs");
										int charge = dep - 10;
										list.get(i).setBalance(charge);
										System.out.println(d + " Deposited Successfully");
										count++;
										System.out.println("Your Balance is :" + list.get(i).getBalance());
									}
									else {
										list.get(i).setBalance(dep);
										System.out.println(d + " Deposited Successfully");
										count++;
										System.out.println("Your Balance is :" + list.get(i).getBalance());
									}
								} else {
									System.out.println("Please Enter amount greater than 0");
								}
								break;
							}

							case 4: {
								flag = 0;
								break;

							}
							
							default : {
								System.out.println("Enter Valid Choice\n");
							}

							}

						}
					}
					
				}
				if(k==1) {
					System.out.println("Invalid User Name or Password\n");
				}
				break;
			}
			case 3: {
				System.exit(0);
			}
			default: {
				System.out.println("Invalid Choice\n");
			}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bu = new Bank();

		bu.choice();

	}

}

class User {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private int balance;
	private int accountNum;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

}
