public class fibonacciSeries {
    public static void main(String[] args) {

         fiboSeries(10);
    }
    public static void fiboSeries(int num){

        int a =0;
        int b =1;

        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
