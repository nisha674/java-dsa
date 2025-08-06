class MissingAp{

    public static int findMissingAp(int[] ap){
        int n = ap.length;
        int ans = 0;
        //find difference
        int d = (ap[n-1]-ap[0])/n;
        
        //loop through each element
        for(int i = 0; i<n-1; i++){
            if(ap[i+1]-ap[i] != d){
                 ans = ap[i]+d;
                
            }
        }
       return ans;
    }

    public static void main(String[] args){
        int[] ap = {10 , 20 , 30 , 50 , 60};
        System.out.println(findMissingAp(ap));

    }
}