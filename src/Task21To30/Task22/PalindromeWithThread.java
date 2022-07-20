/*
 create 1 file and store 100 name. 
 now open that file and read name and check any name is palindrome or not. [use thread ] 
 */

package Task21To30.Task22;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PalindromeWithThread extends Thread  {
	int n;
	int a;
	int b;
	public PalindromeWithThread(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		try{
		for(int i=a;i<b;i++) {
			
	        String line = Files.readAllLines(Paths.get("D:\\ISM\\txtFromFile\\Palindrome.txt")).get(i);
	        String s = line.toLowerCase();
	        StringBuilder name = new StringBuilder(s);
			StringBuilder j = name.reverse();
			if (s.contentEquals(j)) {
				System.out.println(line + "--------- is palindrome"+"--------------------------"+i);
			}
	      } 
		}
	      catch(IOException e){
	        System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		 Path file = Paths.get("E:\\name.txt");

	      // read all lines of the file
	      long count = Files.lines(file).count();
	      int num = (int)count;
	      PalindromeWithThread a = new PalindromeWithThread(0, num/10);
	      PalindromeWithThread b = new PalindromeWithThread(num/10,num/8);
	      PalindromeWithThread c = new PalindromeWithThread(num/8,num/6);
	      PalindromeWithThread d = new PalindromeWithThread(num/6,num/4);
	      PalindromeWithThread e = new PalindromeWithThread(num/4, num/2);
	      PalindromeWithThread f = new PalindromeWithThread(num/2, num);
	      a.start();
	      b.start();
	      c.start();
	      d.start();	
	      e.start();
	      f.start();
//	      29.73 sec
//	      PalindromeThread z = new PalindromeThread(0, num);
//	      z.start();
//	      47.03 sec
	}

}




