public class CyclicRotateByOne {

    public static void CyclicRotate(int[] arr){
        int n = arr.length;
        int lastDigit = arr[n-1];
        System.out.println(lastDigit);

        
        for(int i = n-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastDigit;
    }

    public static void main(String[] args){
        int[] rotate = {1 , 2 , 3 , 4 , 5};
        CyclicRotate(rotate);
        for(int i = 0; i<rotate.length; i++){
            System.out.print(rotate[i]+" ");
        }
    }
}
