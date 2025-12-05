import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public static void main(String[] args) {

        String pattern="abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern,s));

    }
    public static boolean wordPattern(String pattern, String s) {

        Map<Character,String> char_map=new HashMap<>();
        Map<String,Character> word_map=new HashMap<>();

        String words[]= s.split(" ");
        if(pattern.length()!= words.length){
            return false;
        }

        for(int i =0;i<pattern.length();i++){

            char ch=pattern.charAt(i);
            String word= words[i];

            if(!char_map.containsKey(ch)){
                if(word_map.containsKey(word)){
                    return false;
                }
                else{
                    char_map.put(ch,word);
                    word_map.put(word,ch);

                }
            }
            else{

                String mappedWord= char_map.get(ch);
                if(!mappedWord.equals(word)){
                    return false;
                }
            }
        }
        return true;
    }
}
