public class addDigits {
    public static void main(String[] args) {
        int num=99;
        int num2=343;
        System.out.println(addingDigits(num));
        System.out.println(addingDigits(num2));
    }
    private static int addingDigits(int num){
        if(num%9==0){
            return 9;
        }
        int result =num%9;
        return result;


    }
}
