public class removeDuplicate {
    public static void main(String[] args) {

        String str="abac";
        removeDuplicateChar(str);

    }
    public static void removeDuplicateChar(String str){

        int [] count = new int [256];

        for(char ch: str.toCharArray()){
            count[ch]++;
        }
        for(int i=0;i<256;i++){

            if(count[i]>1) {
                System.out.println((char)i + "--> " + count[i]);
            }
        }
    }
}
