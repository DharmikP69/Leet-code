import java.util.Arrays;

public class LC0217 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean nas = containsDuplicate(arr);
        System.out.println(nas);
    }
}
// public static boolean containsDuplicate(int[] nums) {
//      for (int i = 0; i < nums.length; i++) {
//          for (int index = i + 1; index < nums.length; index++) {
//              if(nums[i] == nums[index]){
//                  return true;
//              }
//          }
//      }
//      return false;
// }
// Time complexity for this code is O(n^2) and it can not pass all the test. 
// The optimal solutions is hasmap.But I did not learn has map so I am use sorting .