public class equilibriumIndex {
    public static void main(String[] args) {
        int [] arr = {2,3,4,9,9};
        System.out.println(findingEquilibriumIndex(arr));


    }
    private static int findingEquilibriumIndex(int [] arr){

        int totalSum=0;
        int left=0;

        for(int num :arr){
            totalSum=totalSum+num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum=totalSum-arr[i];
             if (left==totalSum) {
                return i;

            }else {
                 left=left+arr[i];
             }


        }
        return -1;
    }
}
