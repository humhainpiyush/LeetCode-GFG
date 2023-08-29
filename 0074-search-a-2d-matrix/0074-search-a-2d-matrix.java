class Solution {
    public static boolean binSearch(int[] arr, int target){
        int l = 0, r = arr.length -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(target > arr[mid])
                l = mid + 1;
            else
                r = mid - 1;

        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            boolean found = binSearch(matrix[i],target);
            if(found == true)
                return true;
        }
        return false;
    }
}