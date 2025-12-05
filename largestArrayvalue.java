import java.util.Arrays;

public class largestArrayvalue {
    public static void main(String[] args) {

        int [] arr= {8,7,1,1,9};

        int [] count = new int[10];

        for (int num :arr) {
            count[num]++;
        }

        StringBuilder result=new StringBuilder();
        for (int i=9; i >=0 ; i--) {
//
//            if(count[i]>0){
//                result.append(i);
//                count[i]--;
//            }
            while (count[i]>0){
                result.append(i);
                count[i]--;
            }

        }
        System.out.println(result);

    }
}





