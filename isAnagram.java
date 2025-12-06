public class isAnagram{
    public static void main(String[] args) {

        System.out.println(isanagram("silent","listen"));
    }
    public static boolean isanagram(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int [] count = new int[256];

        for(int i=0;i<str2.length();i++){

            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;

        }
        for(int c:count){ // checking the count array in the loop to confirm that all the values are zero!
            if(c!=0)
                return false;
        }
        return true;
    }
}