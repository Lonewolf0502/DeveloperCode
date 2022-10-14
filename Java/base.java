package collectionFramework;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-->0){
		        int n = sc.nextInt();
		        int k = sc.nextInt();
		        sc.nextLine();
		        String s = sc.nextLine();
		        int flip = forPalindrome(s);
		        if(flip <= k){
		            if(s.length() %2 == 1){
		                System.out.println("YES");
		            }
		            else{
		                if((k-flip)%2 == 0){
		                    System.out.println("YES");
		                }else{
		                    System.out.println("NO");
		                }
		            }
		        }
		        else{
		        System.out.println("NO");
		            
		        }
		    }
		    sc.close();
	
		
	}	

		public static int forPalindrome(String s){
		    int left = 0;
		    int right = s.length() - 1;
		    int flip = 0;
		    while(left < right){
		    for (int i =0;i<s.length()-1;i++){
		        if(s.charAt(left) != s.charAt(right)){
		            flip++;
		        }
		        left++;
		        right--;
		    }
		   
		    }
		     return flip;
		}
		
}	
