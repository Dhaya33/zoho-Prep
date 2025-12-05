public class palindromewithoutspecialcharacter {
    public static void main(String[] args) {

        String str="@#aba";
        System.out.println(palindrome(str));

    }

    public static boolean palindrome(String str){

        int left=0;
        int right=str.length()-1;

        while(left<=right){
            if(str.charAt(left)==str.charAt(right)){
                return true;
            } else if (!Character.isAlphabetic(str.charAt(left))) {
                left++;

            }
            else if (!Character.isAlphabetic(str.charAt(right))) {
                right--;

            }
            else {
                return false;
            }

        }return true;
    }

}
