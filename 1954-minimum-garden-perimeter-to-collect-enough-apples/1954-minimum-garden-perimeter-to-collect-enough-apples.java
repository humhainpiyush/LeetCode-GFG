class Solution {
    public long minimumPerimeter(long neededApples) {
        long sum = 0;
        long level = 0;
        while(level <= 100000){
            sum = 2*level *(level+1) * (2*level + 1);
            if(sum >= neededApples){
                break;
            }
            level++;
        }
        return 8*level;
    }
}