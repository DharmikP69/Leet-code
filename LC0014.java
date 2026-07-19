import java.util.Arrays;

public class LC0014 {
     public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while(i < first.length() && i < last.length()){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        String answer = longestCommonPrefix(str);

        for (Character s : answer.toCharArray()) {
            System.out.print(s);
        }
    }
}
