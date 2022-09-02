import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RedBlue {
    public static boolean isValid(int[][] mat, int i, int j) {
        return (i >= 0 && i < mat.length && j >= 0 && j < mat.length);
    }

    // Find the longest path starting from cell (i, j) formed by adjacent
    // numbers in a matrix
    public static int findLongestPath(int[][] mat, int i, int j)
    {
        int count = 0;
        if(i<mat.length && j<mat[0].length && mat[i][j]==1)
        {
            count++;
            findLongestPath(mat,i+1,j+1);
        }
        if(i<mat.length && j<mat[0].length && mat[i][j]!=1)
        {
            System.out.println(mat[i][j]);
            findLongestPath(mat,i+1,j+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] []a =  {
                {0,1,1,0},
                {0,1,0,0}
        };
        //System.out.println(a.length-1);
        System.out.println(findLongestPath(a,0,0));
        System.out.println("a: "+a[0][1]);
    }

}

