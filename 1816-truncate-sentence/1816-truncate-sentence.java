class Solution {
    public static String truncateSentence(String s, int k) {
        String [] sArr = s.split(" ");
        String st = new String();
        for(int i = 0; i < k; i++){
            if(i == k - 1){
                st = st.concat(sArr[i]);
            }
            else
            st = st.concat(sArr[i]).concat(" ");
        }
        return st;
    }
}