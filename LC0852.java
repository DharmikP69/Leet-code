public class LC0852 {
    public static int peakIndex(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndex(arr));
    }
}
