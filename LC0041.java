public class LC0041 {
    public static int firstMissingPositive(int[] nums) {
       int n = nums.length;

        int i = 0;

        while (i < n) {

            int correct = nums[i] - 1;

            if (nums[i] > 0 &&
                nums[i] <= n &&
                nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; 
    }
    public static void main(String[] args) {
        int[] qarr = {1,0,2};

        int nas = firstMissingPositive(qarr);

        System.out.println(nas);
    }
}
