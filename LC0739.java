import java.util.Stack;

public class LC0739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {30,40,50,60};
        int[] ans = dailyTemperatures(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
