import java.util.Scanner;

public class triangleStarPattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int row=1;row<=5;row++){

            for (int col = 1; col <=(n*2)-1; col++) {

                
                if(row+col<=n){
                    System.out.print("  ");
                }
                else if(col-row>=n){
                    System.out.print("  ");

                }else {
                    System.out.print( row+ " ");
                }

            }
            System.out.println();
        }in.close();
    }
}
