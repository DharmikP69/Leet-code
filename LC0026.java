public class LC0026 {
    public static int removeDuplicates(int[] nums){
        int i=0,j=1;
        int count = 1;

        while (j < nums.length){
            if(nums[j] == nums[j-1]){
                j++;
            } else {
                nums[i+1] = nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);

        System.out.println(ans);
    }
}
