public class LC0125 {
    public static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() -1;

        while(start <= end){
           while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
            start++;
        }

        while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
            end--;
        }

        if (Character.toLowerCase(s.charAt(start))
                != Character.toLowerCase(s.charAt(end))) {
            return false;
        }

        start++;
        end--;
    }

    return true;
}
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}
