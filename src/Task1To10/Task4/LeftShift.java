/*  perform leftshift in 11 number using recursion. */

package Task1To10.Task4;
import java.util.Scanner;

public class LeftShift {

	static void recursive(int arr[],int shiftkey) {
		   if ( shiftkey >= 1 )
		   {
		      int temp = arr[0];
		      for(int i=0;i<arr.length-1;i++) {
		    	  arr[i]=arr[i+1];
		      }
		      arr[arr.length-1]=temp;
		      recursive( arr, shiftkey - 1 );
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the Array");
	int size = sc.nextInt();
	int[]arr = new int[size];
	System.out.println("Enter the Values of Array");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the Amount of LeftShift to be done");
	int Shiftkey = sc.nextInt();
	recursive(arr,Shiftkey);
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
	}
}
}