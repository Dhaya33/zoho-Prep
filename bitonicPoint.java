public class bitonicPoint {
    public static void main(String[] args) {

        int [] arr={1,3,1,12,14,1};
        System.out.println(findingBitonicpoint(arr));
    }
    private static int findingBitonicpoint(int [] arr){

        int left =0;
        int right =arr.length;

        while(left<=right){
            int mid= (left+right)/2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid+1]) {
                return arr[mid];
            } else if (arr[mid-1]>arr[mid]) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;


    }
}
