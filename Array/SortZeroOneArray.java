public class SortZeroOneArray{

    public static void sortArray(int[] arr){
        int count = 0;

        // count zeros in a array
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);

        // fill zero in first places
        for(int i = 0 ; i<count; i++){
            arr[i] = 0;
        }

        // fill 1 in last positions
        for(int i = count; i< arr.length; i++){
            arr[i] = 1;
        }
    }

    public static void main(String[] args){
        int[] arr = {1 , 0 , 1 , 0};
        sortArray(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}