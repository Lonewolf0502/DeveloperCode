//question is to find maximum path to travel only in downward or right direction in a 2D array and reach at any one of the right or bottom edge of the array.
//using this code, maximum path from top to any point bottom can also be implemented
//also only 1D dynamic array is required to store a data in this optimized solution

import java.util.Arrays;

public class maximumpathsum {
    public static int maximum(int a,int b){
        int maxint;
        if(a>b){maxint = a;
        }
        else{maxint = b;
        }
        return maxint;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {-1,7,-2,10,-5},
                {8,-4,3,-6,0},
                {5,1,5,6,-5},
                {-7,-4,1,-4,8},
                {7,1,-9,4,0}
        };
        int max = Integer.MIN_VALUE;
        int n = arr.length-1;
        int[] arr2 = new int[n+1];

        //we have taken only a 1-D array for storing the max values of each index since
        //since we require only the right and the down element and then it becomes useless
        //so the previous elements of a 2D DP array would be a garbage stored instead of which
        //we take 1D array and keep on replacing with new required elements each time

        //we traverse doing a bottom up approach since
        //I found it easy as the end is fixed at any of the right or bottom edge of array given
        for (int j = n; j >= 0; j--) {
            for (int i = n; i >= 0; i--) {
                //condition for the last most element of the 2D array
                if(j==n && i==n){
                    arr2[i]=arr[j][i];
                    max = maximum(arr2[i],max);
                    continue;
                }

                //condition for the elements of the last row
                if(j == n && i<n){
                    if(arr2[i+1]+arr[j][i] > arr[j][i]){
                        arr2[i]= arr2[i+1]+arr[j][i];
                    }
                    else{
                        arr2[i] = arr[j][i];
                    }
                    max = maximum(arr2[i],max);
                    continue;
                }

                //condition for the elements of the last column
                if(i == n && j<n){
                    if(arr2[i]+arr[j][i] > arr[j][i]){
                        arr2[i]= arr2[i]+arr[j][i];
                    }
                    else{
                        arr2[i] = arr[j][i];
                    }
                    max = maximum(arr2[i],max);
                    continue;
                }

                //condition for elements NOT at any right or bottom edges of the 2D array
                if(i<n && j<n){
                    if(arr2[i]+arr[j][i] > arr2[i+1]+arr[j][i]){
                        arr2[i] = arr2[i]+arr[j][i];
                    }
                    //the element would have to compulsorily go in any one of right or down direction
                    //since the program ends when it reaches the edge
                    else{
                        arr2[i] = arr2[i+1]+arr[j][i];
                    }

                    max = maximum(arr2[i],max);
                    continue;
                }
            }
        }

        System.out.println("The Inputted array was : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("\n");
        System.out.println("The maximum length path is: "+max);
        //we stored the max value of the maximum length of the path throughout the array given
    }
}
