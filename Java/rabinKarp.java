package Algorithms;

import java.util.Scanner;

public class SubstringProblemByRabin_karp {
public final static int d = 256;
	  
   
    static void search(String M, String s, int q)
    {
        int m = M.length();
        int N = s.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;
  
        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;
  
        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < m; i++) {
            p = (d * p + M.charAt(i)) % q;
            t = (d * t + s.charAt(i)) % q;
        }
  
        // Slide the pattern over text one by one
        for (i = 0; i <= N - m; i++) {
  
            
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < m; j++) {
                    if (s.charAt(i + j) != M.charAt(j))
                        break;
                }
  
                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == m)
                    System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
  
           
            if (i < N - m) {
                t = (d * (t - s.charAt(i) * h) + M.charAt(i + m)) % q;
  
                
                if (t < 0)
                    t = (t + q);
            }
        }
    }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String M = sc.nextLine();
		int n =sc.nextInt();
		while(n-->0) {
			String s = sc.nextLine();
			int q = 10000;
			search(M,s,q);
		}
		
	}
}
