import java.util.Arrays;
public class LC3312{
    public static int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }

        long[] gcdPairs = new long[max + 1];

        for (int g = max; g >= 1; g--) {
            int count = 0;

            for (int multiple = g; multiple <= max; multiple += g) {
                count += freq[multiple];
                gcdPairs[g] -= gcdPairs[multiple];
            }

            gcdPairs[g] += 1L * count * (count - 1) / 2;
        }

        for (int i = 2; i <= max; i++) {
            gcdPairs[i] += gcdPairs[i - 1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = upperBound(gcdPairs, queries[i]);
        }

        return ans;
    }

    private static int upperBound(long[] prefix, long target) {
        int left = 1;
        int right = prefix.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (prefix[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        

        int[] nums = {2, 3, 4};
        long[] queries = {0, 1, 2};

        int[] ans = gcdValues(nums, queries);

        System.out.println(Arrays.toString(ans));
    }
}