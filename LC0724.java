public class LC0724 {
    public static int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            left += nums[i-1];
            right = sum - nums[i] - left;

            if(left == right){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int nas = pivotIndex(arr);
        System.out.println(nas);
    }
}
