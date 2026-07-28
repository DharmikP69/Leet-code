import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import java.util.HashSet;

public class LC2215 {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1)
            set1.add(num);

        for (int num : nums2)
            set2.add(num);

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num))
                first.add(num);
        }

        for (int num : set2) {
            if (!set1.contains(num))
                second.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(first);
        ans.add(second);

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        List<List<Integer>> nas = findDifference(nums1, nums2);

        System.out.println(nas);
    }
}
