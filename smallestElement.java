public class smallestElement {
    public static void main(String[] args) {
        int[] arr={11,3,4,5};
        System.out.println(smallestElementArray(arr));
    }
    public static int smallestElementArray(int [] arr){

        int min =Integer.MAX_VALUE;

        for(int i =0; i< arr.length;i++){

            if(arr[i]<min){
                min=arr[i];

            }

        }return min;



    }
}
