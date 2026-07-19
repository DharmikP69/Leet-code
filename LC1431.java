import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];

        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }

        // for (int i = 0; i < candies.length; i++) {
        // if(candies[i] + extraCandies >= max){
        // list.add(true);
        // } else {
        // list.add(false);
        // }
        // }
        //think this solution
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 3 };
        int extra = 3;
        List<Boolean> ans = kidsWithCandies(arr, extra);
        for (Boolean val : ans) {
            System.out.print(val + " ");
        }
    }
}
