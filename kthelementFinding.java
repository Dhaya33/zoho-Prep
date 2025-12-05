import java.util.PriorityQueue;

public class kthelementFinding {


    public static void main(String[] args) {
        int[] arr={1,3,4,6,45};
        System.out.println(KthsmallestElement(arr,4));


    }
    private static int KthsmallestElement(int [] arr,int k) {

        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        for(int num : arr){
            minHeap.add(num);
            //System.out.println(num);
        }
        if(k>=arr.length){
            return -1;
        }
        for (int i = 0; i <= k-1; i++) {

            minHeap.poll(); //by following condition, it removes 1st,2nd index elements(k-1)

        }
        if (minHeap.isEmpty()) { //If MinHeap(QUEUE) is empty, returns -1 & this code encounters nullpointer exception
            return -1;
        }

        return minHeap.peek();// here,the kth element is the 1st element, so this method returns peek element.

    }
}
