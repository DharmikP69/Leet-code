import java.util.Scanner;

public class LC0172 {
    public static int trailingZeroes(int n){
        int count = 0;

        if(n <= 4){
            return 0;
        }
        while(n > 0){

            n = n / 5;
            count = count + n;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = trailingZeroes(n);
        System.out.print(ans);
        sc.close();
    }
}
