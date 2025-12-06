public class practice2ndLargestNumber {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        System.out.println(secondlargestNumber(arr));
    }
    public static int secondlargestNumber(int[] arr){

        int max=Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;

        for(int num:arr){
            if(max<num){

                secondMax=max;
                max=num;
            } else if (secondMax<num && num!=max) {

                secondMax=num;

            }

        }return secondMax;
    }
}
