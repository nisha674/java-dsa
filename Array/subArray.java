public class subArray {

    public static void print(int arr[]){
        //print subarray
        for(int i = 0; i<arr.length; i++){
           
            for(int j = 0; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <=j; k++){
                    System.out.print(arr[k]);
                    sum += arr[k];
                }
                System.out.println();
                System.out.println("sum: "+sum);
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args){
        int arr[] = {2 , 4 , 6 , 8 , 10};
        print(arr);
    }
}
