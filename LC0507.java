import java.util.Scanner;
public class LC0507 {
    public static boolean perfectNumber(int x){
        int sum = 0;
        for (int i = 1; i < x-1; i++) {
            if(x % i == 0){
                sum = sum + i;
            }
        }
        if (sum == x){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean ans = perfectNumber(n);
        System.out.println(ans);
        sc.close();
    }
}
