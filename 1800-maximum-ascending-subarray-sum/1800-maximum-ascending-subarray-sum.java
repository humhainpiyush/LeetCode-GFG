class Solution {
    public static int maxAscendingSum(int[] nums) {
        int sumT = nums[0], sum = sumT;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                sumT += nums[i];
            }
            else{
                if(sumT > sum){
                    sum = sumT;
                }
                sumT = nums[i];
            }
        }
        if(sum < sumT) sum = sumT;
        return sum;
    }
}