public class findUniqueElement {
    public static void main(String[] args) {
        int [] arr = {4,2,5,2,4};
        System.out.println(findingUniqueElement(arr));


    }
    private static int findingUniqueElement(int [] arr){

        int result=0;
        for (int num : arr){
            result = result ^ num;

        }return result;
    }
}
