class Solution {
    public static int prefixCount(String[] words, String pref) {
        int count = 0, size = pref.length();
        for(int i = 0; i<words.length; i++){
            if(words[i].length() < size) continue;
            if(words[i].substring(0,size).equals(pref)) count++;
        }
        return count;
    }
}