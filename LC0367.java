 import java.util.Scanner;

public class LC0367 {
   
    public static boolean isPerfectSquare(int nums) {
        int start = 1;
        int end = nums;
        while (start <= end){
            int mid = start + (end - start)/2 ;
            long square = (long) mid * mid;

            if(square == nums){
                return true;
            } else if (mid > nums/mid){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean ans = isPerfectSquare(n);
        if (ans){
            System.out.print(n + " is perfect square");
        } else {
            System.out.print(n + " is not perfect square");
        }
        sc.close();
    }
}
