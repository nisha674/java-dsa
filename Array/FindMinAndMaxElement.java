public class FindMinAndMaxElement {

    public static void findMinAndMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }
        System.out.println("Min val: "+ min);
        System.out.println("Max value: "+max);
    }

    public static void main(String[] args){
        int[] arr = {1 , 20 , 3 , 50 , 4 , 0};
        findMinAndMax(arr);
    }
}
