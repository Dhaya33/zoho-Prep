import java.util.Arrays;

class MissingInArray {

    static int missingNum(int[] arr) {
        int n = arr.length + 1;           // actual n (one number missing)
        long expectedSum = (long)n * (n + 1) / 2;
        long actualSum = 0;
        for (int v : arr){
            actualSum += v;
        }
        return (int)(expectedSum - actualSum);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5};
        System.out.println("Missing number is: " + missingNum(arr));
    }

}