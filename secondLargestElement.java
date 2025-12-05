public class secondLargestElement {
    public static void main(String[] args) {
        int [] arr = {4,5,3,6,1};

        System.out.println(FindSecondLargestElement(arr));
    }

    private static int FindSecondLargestElement(int [] arr){

        if(arr.length==0 || arr.length==1) return -1;

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int nums:arr){
            if(max<nums)
            {
                sec_max=max;
                max=nums;
            } else if(sec_max<nums && nums!=max) {
                sec_max=nums;
                //System.out.println(sec_max);


            }


        }
        if(sec_max==Integer.MIN_VALUE){
            return max;
        }

        return sec_max;

    }
}
