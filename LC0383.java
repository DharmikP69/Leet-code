public class LC0383 {
    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if(count[ch - 'a'] == 0){
                return false;
            }

            count[ch - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "aaab";
        System.out.println(canConstruct(str1, str2));
    }
}
