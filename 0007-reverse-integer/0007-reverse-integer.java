class Solution {
    public int reverse(int x) {
        int n = x;
        long num = 0;
        while(n != 0){
            int l = n % 10;
            num = num*10 + l;
            n /= 10;
        }
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
        return 0;
        return (int) num;
    }
}