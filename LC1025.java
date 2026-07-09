import java.util.Scanner;

public class LC1025 {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean ans = divisorGame(n);
    System.out.print(ans);
    sc.close();
    }
}
