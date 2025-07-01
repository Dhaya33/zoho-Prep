public class Palindrome {
    public static void main(String[] args) {
        String str="@ab#c$ba";
        System.out.println(checkPalindrome(str));
    }

    private static Boolean checkPalindrome(String str){

        int left=0;
        int right=str.length()-1;


        while(left<right){
            if(!Character.isAlphabetic(str.charAt(left))){

                left++;

            } else if (!Character.isAlphabetic(str.charAt(right))) {
                right--;

            }
            else if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }return true;

    }
}
