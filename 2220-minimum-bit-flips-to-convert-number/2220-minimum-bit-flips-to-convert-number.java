class Solution {
    public int minBitFlips(int start, int goal) {
        int result = start ^ goal;
        int count = 0;
        String binString = Integer.toBinaryString(result);
        for(int i = 0; i<binString.length(); i++){
            char c = binString.charAt(i);
            if(c == '1')
                count++;
        }
        return count; 
    }
}