class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int transpose[][]=new int[row][column];
       for(int i=0;i<row;i++)
       {
        for(int j=0;j<column;j++)
        {
            transpose[j][i]=matrix[i][j];
        }
       } 
       for(int i=0;i<row;i++)
       {
        int left=0,right=row-1;
        while(left<right)
        {
            int temp=transpose[i][left];
            transpose[i][left]=transpose[i][right];
            transpose[i][right]=temp;
            left++;
            right--;
        }
       }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = transpose[i][j];
            }
        }

    }
}