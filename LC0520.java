public class LC0520{
    public static boolean detectCapitalUse(String word) {
        int upper = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }

        return upper == word.length()
                || upper == 0
                || (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }
    public static void main(String[] args) {
        String s = "GOOGLE";

        boolean nas = detectCapitalUse(s);
        System.out.println(nas);
    }
}