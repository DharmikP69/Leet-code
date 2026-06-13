import java.util.Scanner;
public class LC1342 {
    public static int numberOfSteps(int n){
        int count = 0;
        while (n != 0) {
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = n - 1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int ans = numberOfSteps(n);
        System.out.println("The total stpes to make " + n + " to 0 is " + ans + " .");
        sc.close();
    }
}
