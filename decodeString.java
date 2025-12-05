import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        String str="3[a]2[bc]";

        System.out.println(DecodeString(str));


    }
    private static String DecodeString(String str){

        Stack<Integer> num_stack = new Stack<>();
        Stack<StringBuilder> strStack=new Stack<>();

        int num =0;
        StringBuilder ans=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                num=(num * 10)+(ch-'0');


            } else if (ch=='[') {

                num_stack.push(num);
                num=0;
                strStack.push(ans);
                ans=new StringBuilder();

                
            } else if (ch==']') {
                String st = ans.toString();
                ans=new StringBuilder(st.repeat(num_stack.pop()));
                ans = strStack.pop().append(ans);

            }else{

                ans.append(ch);
            }

        }return ans.toString();


    }



}
