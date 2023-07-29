class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int [] arr = new int[rectangles.length];
        int max = Integer.MIN_VALUE, countMax = 0;
        for(int i = 0; i<rectangles.length; i++){
            arr[i] = Math.min(rectangles[i][0],rectangles[i][1]);
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                countMax += 1;
            }
        }
        return countMax;
    }
}