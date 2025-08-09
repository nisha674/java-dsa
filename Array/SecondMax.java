public class SecondMax {

    public static void findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
        
    }

    public static void main(String[] args){
        int[] arr = {1 , 4 , 5 , 10 , 25};
        findSecondMax(arr);
    }
}
