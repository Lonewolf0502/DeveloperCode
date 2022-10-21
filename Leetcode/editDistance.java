//Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
//https://leetcode.com/problems/edit-distance/

//Time Complexity: O(N*M)
//Space Complexity: O(M)

import java.util.*;

public class editDistance {

        static int editDist(String S1, String S2){

            int n = S1.length();
            int m = S2.length();

            int[] prev=new int[m+1];
            int[] cur=new int[m+1];

            for(int j=0;j<=m;j++){
                prev[j] = j;
            }

            for(int i=1;i<n+1;i++){
                cur[0]=i;
                for(int j=1;j<m+1;j++){
                    if(S1.charAt(i-1)==S2.charAt(j-1))
                        cur[j] = 0+prev[j-1];

                    else cur[j] = 1+Math.min(prev[j-1],Math.min(prev[j],cur[j-1]));
                }
                prev = (int[])(cur.clone());
            }

            return prev[m];

        }

        public static void main(String[] args) {

            String s1 = "ITER";
            String s2 = "IIT";

            System.out.println("The minimum number of operations required is: "+
                    editDist(s1,s2));
        }
    }