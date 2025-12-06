public class merge2Arrays {
    public static void main(String[] args) {

        int [] arr1={1,2,3};
        int [] arr2={3,5,6};
        mergeTwoArrays(arr1,arr2);
    }
    public static void mergeTwoArrays(int[] arr1, int[] arr2){

        int [] merged = new int[arr1.length+arr2.length];

        int index=0;
        for(int num:arr1){

            merged[index++]=num;

        }
        for(int num:arr2){

            merged[index++]=num;

        }

        for(int num: merged){

            System.out.print(num +" ");
        }
    }
}
