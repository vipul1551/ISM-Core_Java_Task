/*
	 take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
	store into 	even.txt if number is even.
	
	take 1 file name with entire path
		if file is present count total number of vowels from it.
		if file not present print file not present try again.
		
	take 1 folder name with user and count how many java files present in that folder. 
	if user entered wrong directory handle that scenario with proper message. 
 */

package Task11To20.Task19;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EvenOddThread {

public static void main(String[] args) throws IOException {
		
		File f = new File("numbers.txt");
		Scanner sc = new Scanner(System.in);
		
		File e = new File("even.txt");
		File o = new File("odd.txt");
		
		PrintWriter pw = new PrintWriter(f);
		for(int i=0;i<=5;i++) {
			
			System.out.println("Enter Number : ");
			int num = sc.nextInt();
			pw.println(num);
			
		}
		pw.close();
		
		PrintWriter even = new PrintWriter(e);
		PrintWriter odd = new PrintWriter(o);
		
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		while(true) {
			String str = br.readLine();
			if(str == null) {
				
				break;
			}
			if(Integer.parseInt(str) % 2 == 0) {
				System.out.println(str + " Even");
				even.println(str);
			}
			
			else {
				System.out.println(str + " Odd");
				odd.println(str);
			}
		
		}
		br.close();
		even.close();
		odd.close();
	}
}
