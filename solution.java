class solution {
    public static void main(String [] args){
        long ans=isPerfectSquare(16);
        System.out.println(ans);
    }
    static long isPerfectSquare(long num) {
        if (num == 1)
            return num;
        long left = 1;
        long right = num / 2 ;
        while (left <= right) {
            long mid = (left + right) / 2;
            if ( mid * mid == num)
                return mid;
            else if(mid *mid > num){
                right =mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}