import java.util.Scanner;
public class LC0231 {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 2 == 0){
            n = n /2;
        }
        return n == 1;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean ans = isPowerOfTwo(n);
    System.out.print(ans);
    sc.close();
    }  
}
