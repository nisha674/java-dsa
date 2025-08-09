package Numerical;
import java.util.*;

public class CountPrime {

    public static int CountPrime(int n){
        if(n == 0 || n == 1){
            return 0;
        }
        int count = 0;
        for(int i = 2; i <= n; i++){
            boolean b = true;
            for(int j = 2; j<=i/2; j++){
                if(i%j == 0){
                    b = false;
                }
            }
            if(b == true){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountPrime(n));
    }
}
