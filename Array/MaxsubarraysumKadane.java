public class MaxsubarraysumKadane {

    public static void Kadane(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            currSum  += arr[i];
            if(currSum < 0){
            currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(" case 1 Maximum sum: "+maxSum);
    }
    public static void Kadane2(int arr[]){
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            cs = Math.max(arr[i] , arr[i]+cs);
            maxSum = Math.max(cs , maxSum);
        }
        System.out.println("case 2 Maximum sum: "+maxSum);
    }

    public static void main(String[] args){
        // positive and mix case
        int arr[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};

        // for negative case
        int kk[] = {-8 , -3 , -6 , -2 , -5 , -4};
        Kadane(arr);
        Kadane2(kk);
    }
}
