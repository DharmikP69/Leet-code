import java.util.Scanner;

public class LC0342 {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 4 == 0){
            n = n /4;
        }
        return n == 1;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean ans = isPowerOfFour(n);
    System.out.print(ans);
    sc.close();
    }  
}
