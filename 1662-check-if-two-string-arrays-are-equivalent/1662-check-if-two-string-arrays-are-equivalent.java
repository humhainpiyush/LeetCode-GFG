class Solution {
    public static String concatStr(String [] word){
        String s = new String();
        for(int i = 0; i<word.length; i++){
            s = s.concat(word[i]);
        }
        return s;
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = concatStr(word1);
        String str2 = concatStr(word2);
        return str1.equals(str2);
    }
}