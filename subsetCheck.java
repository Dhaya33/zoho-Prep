public class subsetCheck {
    public static void main(String[] args) {
        int [] arr1= {1,2,3,5};

        int [] arr2= {2,6};

        System.out.println(findingSubCheck(arr1,arr2));
    }
    private static boolean findingSubCheck(int [] arr1, int [] arr2){
        int i=0,j=0; // both are pointers

        while(i<arr1.length&& j<arr2.length){  // traversing until the size of both arrays

            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]==arr2[j]) {
                i++;
                j++;
            }else {
                return false;
            }

        }return j==arr2.length;  // checking that both elements in i and j are same, then j has remaining
                                 // unmatched element, so we have to check the length of the array.

    }
}
