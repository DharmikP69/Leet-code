public class LC1365{
    public static int[] smallNumberThanCurrent(int[] nums){
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] arr = {6,4,4,4};
        int[] arr2 = smallNumberThanCurrent(arr);
        System.out.print("Array : ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
