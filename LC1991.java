public class LC1991 {
    public static int findMiddleIndex(int[] nums) {
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
        int[] arr = {2,3,-1,8,4};
        
        int nas = findMiddleIndex(arr);
        System.out.println(nas);
    }
}
