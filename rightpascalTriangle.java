public class rightpascalTriangle{
    public static void main(String[] args) {
        PractisingPattern(5);

    }
    static void PractisingPattern(int n){

        for (int row = 1; row <=2*n-1 ; row++) {

            int spaces = row>n?2*n-row:row;

            for (int col = 1; col <=spaces; col++) {

                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
