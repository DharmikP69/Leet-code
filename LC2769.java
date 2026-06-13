public class LC2769 {
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
    public static void main(String[] args) {
        int  num = 4, t = 1;
        int ans = theMaximumAchievableX(num, t);
        System.out.print(ans);
    }
}
