import java.util.Scanner;

public class LC0069 {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start)/2 ;

            if((long)mid * mid == x){
                return mid;
            } else if (mid > x/mid){
                end = mid-1;
            } else {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = mySqrt(n);
        System.out.print("The square root of " + n + " is " + ans);
        sc.close();
    }
}
