import java.sql.SQLOutput;

public class longestNonRepeatingSubstrng {
    public static void main(String[] args) {
        String str = "abade";
        System.out.println(findingLongestNonrepeatingSubstring(str));

    }

    private static int findingLongestNonrepeatingSubstring(String str){
        int start=0;
        int maxlen=0;
        int[] lastseen=new int[256];

        for (int i = 0; i <str.length() ; i++) {
            char currentchar=str.charAt(i);
            if(lastseen[currentchar]>start){
                start = lastseen[currentchar];

            }
            lastseen[currentchar]=i+1;
            maxlen=Math.max(maxlen,i+1-start);



        }

        return maxlen;


    }
}
