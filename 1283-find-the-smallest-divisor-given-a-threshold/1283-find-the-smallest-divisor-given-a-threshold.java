class Solution {
    public static int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            max = Math.max(max, val);
        }

        int l = 1, r = max, ans = 0;

        while(l <= r){
            int mid = l + (r - l)/2;
            int sum = 0;

            for(int i = 0; i<nums.length; i++){
                if(nums[i]%mid == 0){
                    sum += nums[i]/mid;
                }
                else
                    sum += (nums[i]/mid) + 1;
            }
            if(sum > threshold){
                l = mid + 1;
            }
            else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}