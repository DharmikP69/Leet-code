import java.util.HashMap;

public class LC0523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2)
                    return true;
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 2, 6, 4, 7 };
        int k = 6;
        boolean nas = checkSubarraySum(arr, k);
        System.out.println(nas);
    }
}
