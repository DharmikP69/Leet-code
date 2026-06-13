//Concatenation of Array
public class LC1929 {
    public static int[] concatenation(int[] nums){
        int[] nums2 = new int[nums.length * 2];
        for(int i = 0; i <nums.length;i++){
            nums2[i] = nums[i];
            nums2[i + nums.length] = nums[i];
        }
        return nums2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] joinedArray = concatenation(arr);
        System.out.println("The Concatenated Array ");
        for(int i = 0; i < joinedArray.length;i++){
            System.out.print(joinedArray[i] + " ");
        }
    }
}
