public class LC0283 {
    public static void moveZeroes(int[] nums) {
        int right = 0;
        int left = 0;

        while(right < nums.length){
            if(nums[right]!=0){
                int trmp = nums[right];
                nums[right] = nums[left];
                nums[left] = trmp;
                right++;
                left++;
            } else {
                right++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
