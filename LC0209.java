public class LC0209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, low = 0, high = 0, res = Integer.MAX_VALUE;

        while(high < nums.length){
            sum = sum + nums[high];

            while(sum >= target){
                int len = high - low + 1;
                res = Math.min(res,len);

                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int ans = minSubArrayLen(target, arr);
        System.out.println(ans);
    }
}
