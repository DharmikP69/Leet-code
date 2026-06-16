import java.util.Scanner;

public class LC1281 {
    public static int subtractProductAndSum(int n) {
        int sum = 0, multiplication = 1; 

        while (n > 0){
            int remainder = n % 10;
            sum = sum + remainder;
            multiplication = multiplication * remainder;
            n = n / 10;
        }

        return multiplication - sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = subtractProductAndSum(n);
        System.out.print(ans);
        sc.close();
    }
}
