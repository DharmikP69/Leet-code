public class LC0268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n;

        for (int i = 0; i < n; i++) {
            ans ^= i;
            ans ^= nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,1};
        int nas = missingNumber(arr);
        System.out.println(nas);
    }
}
