import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC3536 {
    public static int maxProduct(int n) {
        List<Integer> nums = new ArrayList<>();

        while(n != 0){
            int rem = n % 10;
            nums.add(rem);
            n = n / 10;
        }
        nums.sort(Collections.reverseOrder());

        return nums.get(0) * nums.get(1);
    }
    public static void main(String[] args) {
    
        int n = 127;
        int ans = maxProduct(n);
        System.out.print(ans);
       
    }
}
