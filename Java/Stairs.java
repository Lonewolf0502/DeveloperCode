package DynamicProgramming;
import java.util.*;
public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using Dynamic Programming
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//int cp = countPath(n,new int[n+1]);
int cp = countPathTabulation(n);
System.out.println(cp);
	}
	
	public static int countPath(int n , int[] qb) {
		
		if(n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		
		if(qb[n] > 0) {
			return qb[n];
		}
		
		int nm1 = countPath(n-1,qb);
		int nm2 = countPath(n-2,qb);
		int nm3 = countPath(n-3,qb);
		
		int cp = nm1+nm2+nm3;
		qb[n] = cp;
		return cp;
	}
	
	public static int countPathTabulation(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		for(int i =1;i<=n;i++) {
		if(i==1) {
			dp[i] = dp[i-1];
		}
		else if(i==2) {
			dp[i] = dp[i-1] +dp[i-2];
		}
		else {
			dp [i] = dp[i-1] +dp[i-2] +dp[i-3];
		}

	}
		return dp[n];
	}
}
