import java.util.ArrayList;
import java.util.List;

public class LC1441 {
    public static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();

        int i;
        int j = 0;

        for(i = 1; i <= n && j < target.length; i++){

            ans.add("Push");

            if(i == target[j]){
                j++;
            } else {
                ans.add("Pop");
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;

        List<String> nas = buildArray(target, n);

        for (int i = 0; i < nas.size(); i++) {
            System.out.print(nas.get(i) + " ");
        }
    }
}
