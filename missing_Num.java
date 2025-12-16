public class missing_Num {

    public static void main(String[] args) {
        int[] str={3,1,0};
        System.out.println(findMissingNum(str));
    }
    private static int findMissingNum(int[] arr){

        if(arr.length==0){
            return 0;

        }

        int length=arr.length;
        int total_length=length*(length+1)/2;

        for(int nums:arr){
            total_length=total_length-nums;

        }return total_length;


    }
}
