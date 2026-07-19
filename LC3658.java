import java.util.Scanner;

public class LC3658 {
    public static int gcdOfOddEvenSums(int n) {
        int a = n * n + n; //SumEven
        int b = n * n; // Sum Odd

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = gcdOfOddEvenSums(n);
        System.out.print(ans);
        sc.close();
    }
}
