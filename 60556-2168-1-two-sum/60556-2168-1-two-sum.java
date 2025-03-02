import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        int result[] = {-1, -1}; // Default values if no solution is found
        boolean found = false;

        // Main Logic:
        for(int i = 0; i < nums.length; i++){
            // Case 1: If the current element is equal to the target and no zero is present
            if(nums[i] == target) {
                if(!map.containsKey(0)) {
                    // System.out.println("No number equal to 0 is present in the array.");
                    found = true;
                    break;
                } else {
                    result[0] = i;
                    result[1] = map.get(0);
                    found = true;
                    break;
                }
            }
            
            // Case 2: Finding two numbers whose sum is equal to the target
            else if(map.containsKey(target - nums[i])) {
                if(map.get(target - nums[i]) > i) { // Ensure unique indices
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                    found = true;
                    break;
                }
            }
        }
        
        // If no valid pair is found
        if (!found) {
            return result;
        } else {
            return result;
        }
    }
}