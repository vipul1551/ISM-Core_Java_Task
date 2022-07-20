/* 18) 
 Take array of n numbers from user , now modify array so positive and negative  numbers are set in alternate position,
 
input ->   1   3   -4    5   -6   23    -45    67    43   44   56   -90   100
output->   1  -4   3    -6   5   -45     23   -90   67   43   44    56    100

input->   1    2   3   4    5     -1    -2    -3   -4    -5 
output->   1  -1   2   -2    3    -3     4    -4     5    -5
*/

package Task1To10.Task8;
public class Alternate {
  int count = 0;

  void Rightshift(int arr[], int f, int l) {
      int last = arr[l];
      for (int j = l; j > f; j--) {
          arr[j] = arr[j - 1];
      }
      arr[f] = last;
  }

  void alter(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
          if (i % 2 == 0) {
              if (arr[i] < 0) {
                  for (int j = i + 1; j < arr.length; j++) {
                      if (arr[j] > 0) {
                          count = j;
                          break;
                      }
                  }
                  int l = count;
                  if (count != 0) {
                      Rightshift(arr, i, l);
                  }
                  count = 0;
              }
          } else {
              if (arr[i] > 0) {
                  for (int j = i + 1; j < arr.length; j++) {
                      if (arr[j] < 0) {
                          count = j;
                          break;
                      }
                  }
                  int l = count;
                  if (count != 0) {
                      Rightshift(arr, i, l);
                  }
                  count = 0;
              }
          }
      }
  }

  void display(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 8, 10, 88 };
      int arr1[] = { 1, 3, -4, 5, -6, 23, -45, 67, 43, 44, 56, -90, 100 };
      Alternate s = new Alternate();
      System.out.println("__________________");
      s.display(arr);
      s.alter(arr);
      s.display(arr);
      System.out.println("__________________");
      s.display(arr1);
      s.alter(arr1);
      s.display(arr1);
      System.out.println("__________________");

  }
}






/*
import java.util.Scanner;
import java.util.Arrays;

public class AlternateNumbers {

	static int size;
	int array[] = null;

	public AlternateNumbers(int size) {
		array = new int[size];
	}

	public int partition(int a[]) {
		int j = 0;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < flag) {
				// apply swap to partition pos and neg elements on different sides
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return j; // it will be at that position from where only positive elements will be present
		// j is index where first positive element is present
	}

	// method to obtain alternated positioned elements array
	public void alternate(int a[]) {
		int p = partition(a);

		// swap alternate negative elements from the next available positive
		// element till the end of the array is reached, or all negative or
		// positive elements are exhausted.

		for (int n = 0; (p < a.length && n < p); p++, n += 2) {
			int temp = a[n];
			a[n] = a[p];
			a[p] = temp;
		}
	}

	public void print(int a[]) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		size = sc.nextInt();

		AlternateNumbers as = new AlternateNumbers(size);

		// System.out.println("ls.a.length - "+ls.a.length);
		System.out.println("Enter elements of array: ");
		for (int i = 0; i < as.array.length; i++) {
			System.out.println("Enter A[" + i + "] : ");
			as.array[i] = sc.nextInt();
		}
		sc.close();
		System.out.printf("Original Array: ");
		as.print(as.array);
		as.alternate(as.array);
		System.out.printf("\n\nAlternate Array: ");
		as.print(as.array);

	}

}
*/