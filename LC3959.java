import java.util.Scanner;

public class LC3959 {
    public static boolean checkGoodInteger(int n) {
        int dsum = 0, ssum = 0;
        while(n != 0){
            int rmd = n % 10;
            dsum += rmd ;
            ssum += rmd * rmd; 
            n /= 10;
        }

        if(ssum - dsum >= 50){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean ans = checkGoodInteger(n);
        System.out.print(ans);
        sc.close();
    }
}
