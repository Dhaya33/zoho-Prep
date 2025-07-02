import java.util.HashMap;
import java.util.LinkedHashMap;

public class oddCharCount {
    public static void main(String[] args) {
        String str = "abbcdde";
        String str2 = "aabbdccc";

        System.out.println(findOddCharCount(str));
        System.out.println(findOddCharCount(str2));

    }

    private static String findOddCharCount(String str){

        HashMap<Character,Integer> map= new LinkedHashMap<>(); // Use linkedhashmap for storing values orderly.

        StringBuilder result= new StringBuilder();

        for(char ch:str.toCharArray()){

            map.put(ch, map.getOrDefault(ch,0)+1);

        }
        for(char ch: map.keySet()){
            if(map.get(ch)%2!=0){
                result.append(ch);

            }
        }return result.toString();
    }
}
