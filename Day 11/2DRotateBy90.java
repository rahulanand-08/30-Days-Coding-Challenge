//Link:-https://leetcode.com/problems/rotate-image/submissions/

class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length-1;
        int c=matrix.length-1;
        // int i=0;
        int[][] arr=new int[r+1][r+1];
        for(int i=0;i<=r;i++)
        {
            int k=c;
            for(int j=0;j<=r;j++)
            {
                 arr[i][j]=matrix[k][i];
                 k--;
            }  
        }
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=r;j++)
            {
                 matrix[i][j]=arr[i][j];
            }  
        }
    }
}
