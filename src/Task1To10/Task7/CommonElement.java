/*
 * 17)
	Find common Numbers from 2 one dimension arrays.
		Array1:  1  2  3  4   5  6  7  
		Array2:  2  9  5  10 15  7  80
		Output : 2 5  7 
 */

package Task1To10.Task7;
import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter length of array : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter elements of a");
		
		for(int i=0;i<n;i++) {
			System.out.print("Element "+i+" = ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements of b");
		for(int i=0;i<n;i++) {
			System.out.print("Element "+i+" = ");
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
