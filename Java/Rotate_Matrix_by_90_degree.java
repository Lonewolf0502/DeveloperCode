//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//https://leetcode.com/problems/rotate-image/

public class Rotate_Matrix_by_90_degree {

    public static int[][] transpose(int [][] ary){
        int rows=ary.length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                int temp=ary[i][j];
                ary[i][j]=ary[j][i];
                ary[j][i]=temp;
            }
        }
        return ary;
    }

    public static int[][] rotateCol(int [][] ary){
        int rows=ary.length,cols=ary[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols/2;j++){
                int temp=ary[i][j];
                ary[i][j]=ary[i][cols-1-j];
                ary[i][cols-1-j]=temp;
            }
        }
        return ary;
    }

    public static void rotate(int[][] matrix) {
        matrix=transpose(matrix);
        matrix=rotateCol(matrix);

    }
}