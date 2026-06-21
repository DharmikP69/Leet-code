public class LC0088 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        int i = 0; //for iterate in nums3
        int j = 0; //for iterate in nums2
        int k = 0; //for iterate in nums1

        for (int index = 0; index < m; index++) {
            nums3[index] = nums1[index];
        }

        while(i < m && j < n){
            if(nums3[i] < nums2[j]){
                nums1[k] = nums3[i];
                i++;
                k++;
            } else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(j < n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }
        while(i < m){
            nums1[k] = nums3[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;
        merge(arr1, m, arr2, n);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
