public class LC0977 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[pos] = leftSquare;
                left++;
            } else {
                ans[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };

        int[] fArray = sortedSquares(arr);

        for (int index = 0; index < fArray.length; index++) {
            System.out.print(fArray[index] + " ");
        }
    }
}
