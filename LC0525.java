import java.util.HashMap;

public class LC0525 {
    public static int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;

            if (diff == 0) {
                res = Math.max(res, i + 1);
            } else if (!map.containsKey(diff)) {
                map.put(diff, i);
            } else {
                int index = map.get(diff);
                int len = i - index;
                res = Math.max(res, len);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,0,0};
        int nas = findMaxLength(arr);
        System.out.println(nas);
    }
}
