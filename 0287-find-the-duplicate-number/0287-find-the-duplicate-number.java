class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int lastDuplicate = 0;
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1] && nums[i] != lastDuplicate){
                System.out.println(nums[i]);
                lastDuplicate = nums[i];
            }
        }
        return lastDuplicate;
    }
}