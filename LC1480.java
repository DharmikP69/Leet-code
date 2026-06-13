//Running Sum of 1D Array
public class LC1480 {
    public static int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum = sum + nums[j] ;
            }
            result[i] = sum;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = runningSum(arr);

        System.out.print("The running sum of Array : ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
//Optimal : 
//  public static int[] runningSum(int[] nums){
//         for(int i = 1; i < nums.length; i++){
//             nums[i] = nums[i] + nums[i - 1];
//         }
//         return nums;
//  }