public class LC0004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
                k++;
            } else {
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (j < nums2.length) {
            ans[k] = nums2[j];
            j++;
            k++;
        }
        while (i < nums1.length) {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        int n = nums1.length + nums2.length;
        if (n % 2 == 1) { 
            return ans[n / 2];
        } else { 
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        double ans = findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
    }
}
