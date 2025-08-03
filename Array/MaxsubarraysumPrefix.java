public class MaxsubarraysumPrefix {

    public static void prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        //declare prefix sum
        int[]prefix = new int[arr.length];

        //calculate prefix sum
        prefix[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i]; 
        }

        for(int i = 0; i<arr.length; i++){
            int start = i;
            currSum = 0;
            for(int j = i; j< arr.length; j++){
                int end = j;
                currSum = i == 0 ? prefix[end]:prefix[end]-prefix[start-1];
            }
            if( currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("Maximum sum : "+maxSum);
        
    
    }
    public static void main(String[] args){
        int arr[] = {2 , 4 , 6 , 8 , 10};
        prefixSum(arr);
    }
}
