public class MoveNegativeToEnd {

    public static void MoveNegativeToEnd(int[] arr){
        
        int[] temp = new int[arr.length];
        int index = 0;

        // add positive to start
        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= 0){
                temp[index++] = arr[i];
            }
        }

        // add negative to end
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                temp[index++] = arr[i];
            }
        }

        // copying temp to the original
        for(int i = 0; i< arr.length; i++){
            arr[i] = temp[i];
        }

        
      
    }

    public static void main(String[] args){
        int[] arr = {1 , 2 ,-3 , 4 , -5 , 7, -8};
        MoveNegativeToEnd(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
