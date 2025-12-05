public class minPseudoBinaryCount {
    public static void main(String[] args) {
        int num=35;
        System.out.println(findMinPseudoBinaryCount(num));
    }

    private static int findMinPseudoBinaryCount(int num){
        int maxDigit=0;
        while(num>0){

            int digit=num%10;
            maxDigit=Math.max(digit,maxDigit);
            num=num/10;


        }return maxDigit;
    }
}
