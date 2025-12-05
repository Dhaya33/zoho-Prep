public class rhombusPattern {
    public static void main(String[] args) {
        RhombusPattern(5);
    }

    static void RhombusPattern(int n){



        for (int row = 1; row <= 2*n-1; row++) {
            int spaces=row>n?row-n:n-row;
            for (int i = 1; i <=spaces ; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=n-spaces; col++) { // 6th row = 5-1 , prints 4 (*)
                System.out.print("* ");

            }
            System.out.println();
        }
    }


}
