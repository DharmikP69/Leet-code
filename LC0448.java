import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class LC0448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();

        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if(freq.getOrDefault(i, 0) == 0){
                arr.add(i);
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> answer = findDisappearedNumbers(arr);

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
