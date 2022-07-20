/*  Create 2D array of N*N and find the max number from each row.  */

package Task1To10.Task9;
import java.util.Scanner;
public class MaxFrom2DArray {
	Scanner snr = new Scanner(System.in);
	int a=3;
	int no1[][] = new int[a][a];
	int big[] = new int[a];
	
	public void main() {
		System.out.println("Enter the value of element in first Array");
		for(int i=0;i<no1.length;i++) {
			for(int j=0;j<no1.length;j++) {
				no1[i][j] = snr.nextInt();
			}
		}
		
		
		
		System.out.println("First Array");
		for(int i=0;i<no1.length;i++) {
			for(int j=0;j<no1.length;j++) {
				System.out.print(no1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=0;i<no1.length;i++) {
			big[i]=0;
			for(int j=0;j<no1.length;j++) {	
				if(big[i]<no1[i][j]) {
					big[i]=no1[i][j];
				}
			}
		}
		
		for(int i=0;i<big.length;i++) {
			System.out.println(big[i]);
		}
	}
	public static void main(String[] args) {
		MaxFrom2DArray obj = new MaxFrom2DArray();
		obj.main();
	}
}