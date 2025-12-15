public class Downhillpattern {

    public static void downHillPattern(int x) {

        for (int i = 0; i < x; i++) {

            // Print leading spaces
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }

            // Print first half of stars
            for (int k = i; k < x; k++) {
                System.out.print("* ");
            }

            // Print second half of stars
            for (int o = i; o < x - 1; o++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        downHillPattern(5);
    }
}


//def DownHill_Pattern(x):
//        for i in range(x):
//        for j in range(i+1):
//print(' ' ,end = ' ')
//        for k in range(i,x):
//print('*',end = ' ')
//        for o in range(i,x-1):
//print('*',end = ' ')
//print()