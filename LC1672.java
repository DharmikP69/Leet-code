//Richest Customer Wealth
import java.util.Scanner;
public class LC1672 {
    public static int rowSum(int[][] arr){
        int maxWealth = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + sum);
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
         return maxWealth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] accounts = new int[3][3];
        System.out.print("Enter elements for matrix : ");
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int maxWealth = rowSum(accounts);
        System.out.println("Maximum Wealth = " + maxWealth);
        sc.close();
    }
}