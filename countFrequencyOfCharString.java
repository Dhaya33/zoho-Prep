

public class countFrequencyOfCharString {
    public static void main(String[] args) {

        String str= "banana";
        frequencyCounting(str);

    }

    public static void frequencyCounting(String str){

        int [] count =new int[256];


        for(char ch:str.toCharArray()){
            count[ch]++;

        }

        for(int i =0;i<count.length;i++){

            if(count[i]>0){
                System.out.println((char)i + "-->"+count[i]);
            }
        }
    }


}
