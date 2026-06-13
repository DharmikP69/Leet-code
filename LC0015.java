import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LC0015 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            Arrays.sort(nums);
            int left = i+1;
            int right = nums.length - 1;
            int sum = -1*nums[i];
            while(left < right){
                int s = nums[left] + nums[right];
                if(s == sum){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < nums.length && nums[left] == nums[left -1]){
                        left++;
                    }
                    while(right >= 0 && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (s < sum){
                    left++;
                } else {
                    right--;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,0,0,0};
        List<List<Integer>> ans = threeSum(arr);

        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }       
    }
}
