public class fiboRecursive {
    public static void main(String[] args) {

        int num =10;
        System.out.println("Fibonacci of " + num + " = " +fiboRecursion(num));
    }
    public static int fiboRecursion(int num){

        if(num<=1){
            return num;

        }
        return fiboRecursion(num-1) + fiboRecursion(num-2);
    }
}
