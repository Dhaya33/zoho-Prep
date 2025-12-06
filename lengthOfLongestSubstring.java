import java.util.HashMap;
import java.util.LinkedHashMap;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

        String str="aabcad";
        System.out.println(lengthOflongestsubstring(str));

    }

    private static int lengthOflongestsubstring(String str){

        HashMap<Character,Integer> map= new LinkedHashMap<>();

        int maxlen=0;
        int left=0;

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>left){
                left=map.get(ch)+1;
            }

            map.put(ch,i);
            maxlen=Math.max(maxlen,i-left+1);

        }return maxlen;

    }
}