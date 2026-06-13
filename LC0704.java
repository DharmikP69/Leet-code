public class LC0704 {
    public static int binarySearch(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int m = s + (e-s) / 2;

            if(target > nums[m]){
                s = m + 1;
            } else if (target < nums[m]){
                e = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 4;
        int ans = binarySearch(arr, target);
        if (ans != -1){
            System.out.print(target +" exists in nums and its index is " + ans);
        } else {
            System.out.println(target + " does not exist in nums.");
        }
    }
}
