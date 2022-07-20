/*
Create 1 thread that find sum of 1 to 100 and print sum. 


create 2 thread 1st thread find sum of 1 to 50 and 2nd thread find sum of 51 to 100
once both the thread find sum then print final sum. 
 */

package Task11To20.Task17;

public class ThreadTask extends Thread{
	int begin;
	int end;
	static int sum;
	public ThreadTask(int begin , int end) {
		this.begin = begin;
		this.end = end;
		this.sum = 0;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadTask t1 = new ThreadTask(1,50);
		ThreadTask t2 = new ThreadTask(51,100);
		t1.start();
		Thread.sleep(100);
//		int t = t1.sum()+t2.sum();
//		System.out.println(t);
		t2.start();
		
	}
	
	public void run() {
		
		for(int i=begin;i<=end;i++) {
			
			sum = sum + i;
		}
		System.out.println("Sum : " + sum);
		 
		
	}

}












//
//
//public class ThreadTask extends Thread implements Runnable {
//	private int start;
//	private int stop;
//	private static int sum;
//	public ThreadTask(int start,int stop) {
//		this.start = start;
//		this.stop = stop;
//		this.sum=0;
//	}
//	public static void setSum(int sum) {
//		ThreadTask.sum = sum;
//	}
//	public void run() {
//		for(int i=start;i<=stop;i++) {
//			sum+=i;
////			System.out.println(i);
//		}
//	//	System.out.println("Sum---->"+getSum());
//		
//	}
////	public static void printSum() {
////		System.out.println("Sum---->"+getSum());
////	}
// public static void main(String[] args) throws InterruptedException {
//	 ThreadTask t = new ThreadTask(1,50);
//	ThreadTask t1 = new ThreadTask(51,100);
//	t.start();
////	t.getSum();
//	t1.start();
//	Thread.sleep(10);
////	t1.wait(10);
//	System.out.println(t.getSum());
////	System.out.println(t.getSum());
////	System.out.println("Sum--->"+);
//}
//public  int getSum() {
//	return sum;
//}
//}
//
