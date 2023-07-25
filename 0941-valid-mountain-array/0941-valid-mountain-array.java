class Solution {
    public static boolean validMountainArray(int[] arr) {
        int N = arr.length-1;
        int i = 0;
        
        while(i < N && arr[i] < arr[i+1]){
            i++;
        }
        
        if(i == 0 || i == N){
            return false;
        }
        
        while(i < N && arr[i] > arr[i+1]){
            i++;
        }
        
        return i == N;
    }
}