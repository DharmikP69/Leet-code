public class LC796 {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String s2 = s+s;

        return s2.contains(goal);
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean ans = rotateString(s1, s2);
        System.out.println(ans);
    }
}
