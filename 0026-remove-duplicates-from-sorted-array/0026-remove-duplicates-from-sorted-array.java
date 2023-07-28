class Solution {
    public static int removeDuplicates(int[] nums) {
        int [] expectedNums = new int[nums.length];
        int i = 0, j = 0, k = 1;

        expectedNums[0] = nums[0];

        while(i < nums.length && j < nums.length){
            if(nums[i] != nums[j]){
                i = j;
                expectedNums[k++] = nums[i];
                j++;
            }
            else
                j++;
        }
        for(int l = 0; l<expectedNums.length; l++){
            nums[l] = expectedNums[l];
        }

        return k;

        
    }
}