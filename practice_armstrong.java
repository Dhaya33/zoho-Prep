import java.util.Scanner;

public class practice_armstrong {
    public static void main(String[] args) {


       Scanner in = new Scanner(System.in);
       int inputs= in.nextInt();
       practice_armstrong obj= new practice_armstrong();

       System.out.println(obj.armstrong(inputs));
    }
    public boolean armstrong(int num){

        int input = num;
        int sum =0;
        int numberOfDigits= String.valueOf(num).length();

        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,numberOfDigits);
            num/=10;

        }return input==sum;
    }
}
