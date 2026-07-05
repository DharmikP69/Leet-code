import java.util.HashMap;
public class LC0560 {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int ques = sum-k;
            
            count += map.getOrDefault(ques, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        int nas = subarraySum(arr, k);
        System.out.println(nas);
    }
}
