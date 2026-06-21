public class LC0242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : s.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq2[ch - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            if(freq1[index] != freq2[index]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        boolean ans = isAnagram(s,t);
        System.out.print(ans);
    }
}
//int[] freq = new int[26];

// for (char ch : s.toCharArray()) freq[ch - 'a']++;
// for (char ch : t.toCharArray()) freq[ch - 'a']--;

// for (int count : freq) {
//     if (count != 0) return false;
// }
// return true;
