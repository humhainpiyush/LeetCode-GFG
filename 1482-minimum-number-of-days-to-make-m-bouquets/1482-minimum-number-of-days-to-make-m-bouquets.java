class Solution {
    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k){

            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int val : bloomDay){
            max = Math.max(val, max);
            min = Math.min(val, min);
        }

        int l = min, r = max;

        while(l < r){
            int mid = l + (r - l)/2;
            int count = 0;
            if(canMake(mid, m, k, bloomDay)){
                r = mid;
            }
            else 
                l = mid + 1;

            
        }
        return l;
    }

    public static boolean canMake(int mid, int bouquet, int flowers, int[] bloomDay){
        int count = 0;
        for(int i : bloomDay){
            if(i <= mid){
                count++;
                if(count == flowers){
                    bouquet--;
                    count = 0;
                    if(bouquet==0) return true;
                }
            }
            else count = 0;
        }
        return false;
    }
}