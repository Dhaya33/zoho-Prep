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
        int left_window=0;

        for (int right = 0; right <str.length() ; right++) {

            char ch=str.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>left_window){
                left_window=map.get(ch)+1;
            }

            map.put(ch,right);
            maxlen=Math.max(maxlen,right-left_window+1);

        }return maxlen;

    }
}