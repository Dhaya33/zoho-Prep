public class leadersInArray {
    public static void main(String[] args) {
        int [] arr={16,17,4,3,5,2};

        int max=Integer.MIN_VALUE;
        int[] ouput=new int[arr.length+1];

        StringBuilder resultantArray= new StringBuilder();

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i]>max){
                max=arr[i];

                //System.out.println(max+" ");

                resultantArray.insert(0,max+" ");
            }


        }
        System.out.println(resultantArray);




    }
}
