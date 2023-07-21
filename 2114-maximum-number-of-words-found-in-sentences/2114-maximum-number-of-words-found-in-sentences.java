class Solution {
    public static int mostWordsFound(String[] sentences) {
        int maxNoOfWords = Integer.MIN_VALUE;
        for(int i = 0; i < sentences.length; i++){
            int noOfWords = 0, countSpace = 0;
            sentences[i] = sentences[i].trim();
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    countSpace = countSpace + 1;
                }
            }
            noOfWords = countSpace + 1;
            if(noOfWords >= maxNoOfWords){
                maxNoOfWords = noOfWords;
            }
        }
        return maxNoOfWords;
    }
}