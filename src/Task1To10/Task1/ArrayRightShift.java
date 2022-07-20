/*
 take an array of 5 numbers. 
    create right shift function which takes 1 argument countShift.
    if countShift is 1 and your array is a = [1,2,3,4,5] 
    output : 5 1 2 3 4 
    
    if countShift is 3 and your array is a = [1,2,3,4,5]
    output: 3 4 5 1 2 
 */

package Task1To10.Task1;
import java.util.Scanner;
public class ArrayRightShift{
	
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a ={1,2,3,4,5};
		  
        System.out.println("Original array: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");     
        }    
		//Scan by user
		System.out.println("\nEnter the no. for Shift : ");
		int n = sc.nextInt();
		
		 for(int i = 0; i < n; i++){    //i=0;i<2;i++
            int j, last;    
			
            last = a[a.length-1];    //last =a[4]=5
            
            for(j = a.length-1; j > 0; j--){  //j=4;j>0;j--0
			
                a[j] = a[j-1]; //a[4]=a[3];
            }    
            
            a[0] = last;    //a[0]=5  
        }    
        
        System.out.println();    
            
         
        System.out.println("array after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
		
	}


}