import java.util.Stack;
public class LC0316 {
    public static String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            
            freq[ch - 'a']--;

            if (visited[ch - 'a']) {
                continue;
            }

            while(!stack.isEmpty() &&
                  stack.peek() > ch &&
                  freq[stack.peek()  - 'a'] > 0) {

                    visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "bcabc";
        String ans = removeDuplicateLetters(s);

        for (char ch : ans.toCharArray()) {
            System.out.print(ch);
        }
    }
}