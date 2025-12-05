import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class array1IssubsetOfarray2 {
    public static void main(String[] args) {

        String[] arr1= {"dhaya"};
        String[] arr2= {"dhaya"};
        System.out.println(findingSubsetOfArray(arr1,arr2));

    }
    private static boolean findingSubsetOfArray(String[] arr1, String[] arr2){

        Set<String> sets= new HashSet<>();

        if(Arrays.equals(arr1, arr2)){
            System.out.println("strings are equal");
        }

        for(String s:arr1){
            sets.add(s);
        }
        for(String s: arr2){
            if(!sets.contains(s)){
                return false;
            }

        }return true;
    }

}
