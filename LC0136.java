public class LC0136 {
    public static int singleNumber(int[] nums) {
    int ans = 0;

    for(int num:nums){
        ans ^= num;
    }

    return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}

