public class pattern {
    public static void main(String[] args) {

        int n=5;
        for (int i = 1; i <=n ; i++) {

            int temp =i;
            for (int j = 1; j <=i; j++) {
                System.out.print( temp +" "  );

                temp=temp+n-j;       //1st iteration =>  temp ==i(1) ; 1+5-1 = 5
            }
            System.out.println();
        }
    }
}
