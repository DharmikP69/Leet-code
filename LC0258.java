import java.util.Scanner;

public class LC0258 {
    public static int addDigit(int x){
        while(x >= 10){
            int s = 0;

            while(x > 0){
                s = s + x%10;
                x /= 10;
            }
            x = s;
        }
        return x;
    }   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    int ans = addDigit(n);
    System.out.print(ans);
    sc.close();
    }
}
