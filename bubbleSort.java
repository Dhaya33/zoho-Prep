public class bubbleSort {
    public static void main(String[] args) {

        int [] arr={3,4,1,2};

        bubbleSorting(arr);

        for(int num:arr){
            System.out.print(num + " ");

        }

    }
    public static void bubbleSorting(int [] arr){


        for(int i =0;i<arr.length-1;i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }



    }
}


//public class bubbleSort {
//    public static void main(String[] args) {
//
//        int [] arr = {3, 4, 1, 2};
//        bubbleSorting(arr);
//
//        // Display the sorted array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void bubbleSorting(int [] arr) {
//
//        for (int i = 0; i < arr.length - 1; i++) {            // Outer loop
//            for (int j = 0; j < arr.length - 1 - i; j++) {    // Inner loop
//                if (arr[j] > arr[j + 1]) {                    // Compare
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;                        // Swap
//                }
//            }
//        }
//    }
//}