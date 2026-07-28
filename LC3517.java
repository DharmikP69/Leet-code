public class LC3517 {
    public static String smallestPalindrome(String s) {
        int n = s.length();
        int[] counts = new int[26];
        int index = 0;

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n / 2; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            while (counts[i]-- > 0) {
                sb.setCharAt(index++, (char) (i + 'a'));
            }
        }

        char[] arr = sb.toString().toCharArray();

        for (int i = 0; i < n / 2; i++) {
            arr[n - i - 1] = arr[i];
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "babab";
        String ans = smallestPalindrome(s);

        System.out.print(ans);
    }
}
