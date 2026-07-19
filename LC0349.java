import java.util.ArrayList;
import java.util.Arrays;
public class LC0349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while(i < n && j < m){
            if(nums1[i] == nums2[j]){

                if(ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) { 
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[ans.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = ans.get(k);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1, nums2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
