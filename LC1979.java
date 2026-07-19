public class LC1979 {
    public static int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        while(min != 0){
            int temp = max % min;
            max = min;
            min = temp;
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,10,8,9};
        int ans = findGCD(arr);
        System.out.println(ans);
    }
}
