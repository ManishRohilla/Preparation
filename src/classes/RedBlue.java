package classes;

public class RedBlue {
    public static int longestPath(Integer[][]a, int i, int j)
    {
        int count = 0;
        if(i<0 && j<0)
        {
            return count;
        }
        if(a[i][j]==1 && i>=0 && j>=0)
        {
            count++;
            longestPath(a,i-1,j);
        }
        if(a[i][j]==1  && i>=0 && j>=0)
        {
            count++;
            longestPath(a,i,j-1);
        }
        if(a[i][j]==1  && i>=0 && j>=0)
        {
            count++;
            longestPath(a,i+1,j+1);
        }
        return count;
    }

    public static void main(String[] args) {
        Integer [] []a =  {
                {0,1,1},
                {1,1,1},
                {0,0,0}
        };
        System.out.println(longestPath(a,2,2));
    }
}
