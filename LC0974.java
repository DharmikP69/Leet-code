import java.util.HashMap;

public class LC0974{
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int remainder = ((prefixSum % k) + k) % k;

            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
    

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int nas = subarraysDivByK(nums, k);

        System.out.println(nas);
    }
}
