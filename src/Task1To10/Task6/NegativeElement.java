/* 16) 	  	    
   	Move all the negative elements to one side of the array. 
		input -> 1  3  -4  5  -6   23   -45    67   43   44   56   -90   100
		Output -> 1  3   5    23   67   43    56    100   -4   -6  -45   -90 
*/		

package Task1To10.Task6;
import java.util.Scanner;

public class NegativeElement {

	public static void main(String[] args) {
		
		int a[] = new int[11];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter elements = ");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		

	}

}
