public class BinarySearch{

    public static boolean find(int arr[], int target){
        // binary search
        int n = arr.length;
        //find mid;
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
               start = mid+1;
            }else{
                end = mid-1;
            }

        }

        

        return false;
        
    }

    public static void main(String[] args){
        int arr[] = { 10 , 20 , 30 , 40 , 50 , 60 , 70};
        System.out.println(find(arr ,100 ));
    }
}