class Solution {
    public static int oddCells(int m, int n, int[][] indices) {
        int [][] arr = new int[m][n];
        int countOdd = 0;

        for(int i = 0; i<indices.length; i++)
        {
            int row = 0, col = 0;
            while(col < n)
            {
                arr[indices[i][0]][col] += 1; 
                col++;
            }

            while(row < m)
            {
                arr[row][indices[i][1]] += 1;
                row++;
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n ; j++){
                if(arr[i][j]%2 != 0) countOdd += 1;
            }
        }
        return countOdd;
        
    }
}