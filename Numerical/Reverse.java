package Numerical;

public class Reverse {
    public static int rev(int n){
        int rev = 0;
        while(n > 0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
       return rev;
    }
    public static void main(String[] args){
        int n = 123;
        int ans = rev(n);
        System.out.println(ans);
    }
}
