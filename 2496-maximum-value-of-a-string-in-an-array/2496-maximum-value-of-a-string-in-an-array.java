class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for(String s : strs){
            boolean isDigit = true;
            for(char c : s.toCharArray()){
                if(c >= '0' && c <= '9') continue;
                else{
                    max = Math.max(max, s.length());
                    isDigit = false;
                    break;

                }
            }
            if(isDigit){
                max = Math.max(max, Integer.parseInt(s));
            }
        }
        return max;
    }
}