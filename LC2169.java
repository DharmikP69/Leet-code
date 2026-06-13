public class LC2169 {
    public static int countOperations(int nums1,int nums2){
        int count = 0;
        while (nums1 != 0 && nums2 != 0){
            if(nums1 >= nums2){
                nums1 = nums1 - nums2;
            } else  {
                nums2 = nums2 - nums1;
            } 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;
        int ans = countOperations(num1, num2);
        System.out.print(ans);
    }
}
