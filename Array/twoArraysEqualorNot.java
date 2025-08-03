import java.util.Arrays;
public class twoArraysEqualorNot {

    public static boolean equal(int[] arr1 , int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i< arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[]arr1 = {1 , 2  , 3 , 4 , 5};
        int[]arr2 = {1 , 4 , 5 , 3 , 10};
        boolean ans = equal(arr1 , arr2);
        System.out.println(ans);
    }
}
