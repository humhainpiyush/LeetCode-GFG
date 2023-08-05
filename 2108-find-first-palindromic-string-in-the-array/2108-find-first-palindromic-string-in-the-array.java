class Solution {
    public static boolean isPalindrome(String words){
        for(int i = 0; i < words.length()/2; i++){
            if(words.charAt(i) != words.charAt(words.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(isPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
}