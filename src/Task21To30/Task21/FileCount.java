/*
 take 1 folder name with user and count how many java files present in that folder. 
if user entered wrong directory handle that scenario with proper message.
 */

package Task21To30.Task21;
import java.io.File;
import java.util.Scanner;

public class FileCount {
	
	static int count = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Folder : ");
		String path = sc.next();
		File f = new File(path);
		
		if(f.isDirectory()==true) {
			
			File[] fileArr = new File[500];
			fileArr = f.listFiles();
			for(File f1 : fileArr) {
				if(f1.getName().endsWith(".java")) {
					count++ ;
				}
				
			}
			System.out.println(count + " Files Found");

		}
		else {
			System.out.println("Folder not available");
		}

	}

}
