class Solution
{
    public int findDuplicate(int[] nums){
        int size = nums.length;
        int m = Integer.MIN_VALUE;
        int i = 0;
        for(i = 0; i<size; i++){
            m = Math.max(m, nums[i]);
        }
        int arr[] = new int[m+1];
        for(i = 0; i<arr.length; i++){
            arr[nums[i]]++;
        }
        for(i=0; i<arr.length; i++){
            if(arr[i]>1){
                return i;
            }
        }
        return nums.length;
    }
}