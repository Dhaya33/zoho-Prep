public class largestElement {
    public static void main(String[] args) {

        int [] arr={1,2,3,43434,5};

        System.out.println(largestElementInArray(arr));

    }

    public static int largestElementInArray( int[] arr){
        int max=0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>max){
                max=arr[i];
            }

        }return max;
    }

}
