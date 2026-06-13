import java.util.Scanner;
public class LC0326 {
    public static boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 3 == 0){
            n = n /3;
        }
        return n == 1;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean ans = isPowerOfThree(n);
    System.out.print(ans);
    sc.close();
    }  
}
