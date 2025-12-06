public class sumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumofDigits(56534));
    }
    public static int sumofDigits(int num){

        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;

        }
        return sum;
    }
}
