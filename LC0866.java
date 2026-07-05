import java.util.Scanner;

public class LC0866 {

    public static int primePalindrome(int n) {
        if (n <= 11) {
            for (int i = n; i <= 11; i++) {
                if (palindrome(i) && prime(i)) {
                    return i;
                }
            }
        }
        for (int i = n; i < 200_000_000; i++) {

            int numDigits = String.valueOf(i).length();
            if (numDigits % 2 == 0) {
                i = (int) Math.pow(10, numDigits); 
                continue;
            }

            if (palindrome(i) && prime(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean palindrome(int n) {
        int og = n;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n = n / 10;
        }
        return sum == og;
    }

    public static boolean prime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = primePalindrome(n);
        System.out.println(ans);
        sc.close();
    }
}