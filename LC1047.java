import java.util.Stack;
public class LC1047 {
    public static String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.peek() == s.charAt(i)){
                stack.pop();
                continue;
            }
            
            stack.push(s.charAt(i));

        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        String answer = removeDuplicates(str);
        System.out.println(answer);
    }
}
