class Solution {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int mid = (0+n)/2;
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j <= i; j++){
                sum = sum + mat[i][j] + mat[i][n-j-1];
            }
        }
        if(n%2 != 0)
            sum = sum - mat[mid][mid];
        return sum;
    }
}