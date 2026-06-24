public class LC1920 {
     public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        int[] nas = buildArray(arr);

        for (int num : nas) {
            System.out.print(num + " ");
        }
    }

}
