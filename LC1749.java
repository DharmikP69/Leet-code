public class LC1749 {
    public static int maxAbsoluteSum(int[] nums) {
        return Math.max(minSubarraySum(nums),maxSubarraySum(nums));
    }
    public static int minSubarraySum(int[] nums){
        int bestending = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] + bestending;

            bestending = Math.min(v1,v2);
            result = Math.min(bestending,result);
        }

        result = Math.abs(result);

        return result;
    }
    public static int maxSubarraySum(int[] nums){
        int bestending = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] + bestending;

            bestending = Math.max(v1,v2);
            result = Math.max(bestending,result);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,-5,1,-4,3,-2};
        int nas = maxAbsoluteSum(arr);
        System.out.println(nas);
    }
}
