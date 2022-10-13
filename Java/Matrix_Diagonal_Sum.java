// Leetcode- 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/


class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum =0;
        for(int i=0; i < n; i++){
                sum += mat[i][i];
                sum += mat[i][n - 1 - i];
        }

        // Check if the matrix is a odd matrix, for eg. 3 x 3 matrix or 5 x 5 matrix.
        // If yes, then substracting the element which will be added twice from the primary and secondary diagonal
        // for example, 
        // 1 2 3
        // 4 5 6
        // 7 8 9
        
        // In the above matrix, elements 1, 5, 9 form the primary diagonal & elements 3, 5, 7 form the secondary diagonal.
        //If you notice, we have added 5 twice, and that is what we want to substract.
        if(mat.length %2 !=0){
           sum -= mat[mat.length/2][mat.length/2];
        }

        return sum;
    }
}
