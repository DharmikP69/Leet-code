public class LC0034 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 6;

        int[] ans = searchRange(arr, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
