public class MissingNumber {

    public static int MissingNumber(int[] arr){
        int n = arr.length;

        int actualSum = n*(n+1)/2;

        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            sum +=arr[i];
        }
        return actualSum - sum;
    }

    public static void main(String[] args){
        int[] arr = { 0 , 2 , 4, 1};
        System.out.println(MissingNumber(arr));
    }
}
