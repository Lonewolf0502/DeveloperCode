package DynamicProgramming;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int fibnm = FibMemorized(n,new int[n+1]);
System.out.println(fibnm);
	}
	
//	public static int Fib(int n) {
//		
//		if(n==0 || n== 1) {
//			return n ;
//		}
//		int fibnm1 = Fib(n-1);
//		int fibnm2 = Fib(n-2);
//		int fibnm = fibnm1 +fibnm2;
//		return fibnm;
//	}
	
	public static int FibMemorized (int n ,int[] qb) {
		if(n==0||n==1) {
			return n;
		}
		if(qb[n]!=0) {
			return qb[n];
		}
		System.out.println("Hello"+n);
		int fibnm1= FibMemorized(n-1,qb);
		int fibnm2  = FibMemorized(n-2,qb);
		int fibnm = fibnm1+fibnm2;
		
		qb[n]=fibnm;
		return fibnm;
	}

}
