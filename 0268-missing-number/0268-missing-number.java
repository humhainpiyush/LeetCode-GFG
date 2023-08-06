class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sumNaturalNums = (length + 1) * (length)/2;
        int sum = 0;
        for(int i = 0; i<length; i++){
            sum += nums[i];
        }
        return (sumNaturalNums - sum);
    }
}