class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j < words.length; j++){
                if(s.substring(0, i+1).equals(words[j])) count++;
            }
        }
        return count;
    }
}