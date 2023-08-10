class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        for(int i = 1; i<=(nums.length); i++){
            total += i;
            total -= nums[i-1];
        }
        return total;
    }
}