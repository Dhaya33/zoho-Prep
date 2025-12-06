public class secondLargestElement {
    public static void main(String[] args) {
        int [] arr = {4,5,3,6,1};

        System.out.println(FindSecondLargestElement(arr));
    }

    private static int FindSecondLargestElement(int [] arr){

        if(arr.length==0 || arr.length==1) return -1;

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int num:arr){
            if(max<num)
            {
                sec_max=max; // changing the max value because,current value is getting assigned to max;
                max=num;
            } else if(sec_max<num && num!=max) { // this loop will run, if the number is less than and not equal to max
                sec_max=num;                     // and the current second max is also less than this number!~

                //System.out.println(sec_max);


            }


        }
//        if(sec_max==Integer.MIN_VALUE){
//            return max;
//        }

        return sec_max;

    }
}
