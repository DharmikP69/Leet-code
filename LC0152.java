public class LC0152 {
    public static int maxProduct(int[] nums) {
        int minEnding = nums[0];
        int maxEnding = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int c1 = nums[i];
            int c2 = nums[i] * minEnding;
            int c3 = nums[i] * maxEnding;

            minEnding = Math.min(c1, Math.min(c2,c3));
            maxEnding = Math.max(c1, Math.max(c2,c3));
            res = Math.max(res, Math.max(minEnding,maxEnding));
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int nas = maxProduct(arr);
        System.out.println(nas);
    }
}
