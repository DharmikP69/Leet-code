import java.util.Arrays;
public class LC0628{
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int max1 = nums[0] * nums[1] * nums[n];
        int max2 = nums[n]*nums[n-1]*nums[n-2];

        return Math.max(max1,max2); 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int nas = maximumProduct(arr);
        System.out.println(nas);
    }
}