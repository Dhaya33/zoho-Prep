public class reverseString {
    public static void main(String[] args) {
        String str="hello this is dhaya";

        System.out.println(reverseStrings(str));


    }

    public static String reverseStrings(String str){

        int left =0;
        int right=str.length()-1;
        char [] arr=str.toCharArray();

        while(left<right){

            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]= temp;

            left++;
            right--;

        }return new String(arr);
    }


}
