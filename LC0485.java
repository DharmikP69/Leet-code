public class LC0485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int high = 0; 
        int low = 0;
        int res = 0;

        while(high < nums.length){
            if(nums[high] == 0){
                high++;
                res = Math.max(res, high - low);
            } else {
                high ++;
                low = high;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,0,0,5};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
