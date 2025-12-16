import java.util.HashSet;
import java.util.Set;

public class array1IssubsetOfarray2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2= {2,6};
        System.out.println(findingSubsetOfArray(arr1,arr2));


    }
    private static boolean findingSubsetOfArray(int[] arr1, int[] arr2){

        Set<Integer> sets= new HashSet<>();

        for(int nums:arr1){
            sets.add(nums);
        }
        for(int num: arr2){
            if(!sets.contains(num)){
                return false;
            }else {
                return true;
            }

        }return false;
    }

}
