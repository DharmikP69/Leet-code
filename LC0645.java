import java.util.HashMap;

public class LC0645 {
    public static int[] findErrorNums(int[] nums) {
        int[] res = { 0, 0 };

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (freq.getOrDefault(i, 0) == 0) {
                res[1] = i;
            }

            if (freq.getOrDefault(i, 0) == 2) {
                res[0] = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        int[] target = findErrorNums(arr);

        System.out.println("[" + target[0] + "," + target[1] + "]");
    }
}
