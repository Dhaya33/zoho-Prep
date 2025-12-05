public class findingFirstNonRepeatChar {

    public static void main(String[] args) {

        String str = "ababc";

        System.out.println(nonrepeatchar(str));

    }
    private static Character nonrepeatchar(String str){

        int length= str.length();

        if(length<=1){
            return null;

        }

        int [] count = new int[256];

        for(char ch:str.toCharArray()){
            count[ch]++;

        }
        for (int i = 0; i <length ; i++) {
            if(count[str.charAt(i)]==1){
                return str.charAt(i);
            }

        }return null;
    }
}
