class Solution {
    public int countSeniors(String[] details) {
        int countS = 0;
        for(int i = 0; i<details.length; i++){
            int a = Integer.valueOf(details[i].substring(11, 13));
            if(a > 60){
                countS += 1;
            }
        }
        return countS;
    }
}