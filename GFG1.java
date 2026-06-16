// Max Sum Subarray of size K
// Sliding window
public class GFG1 {
    public static int maxSubarraySum(int[] arr, int k) {
        int maxsum= Integer.MIN_VALUE;
        int windowSum = 0;
        int n = arr.length;
        if (n < k){
            return 0;
        }

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxsum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxsum = Math.max(maxsum, windowSum);
        }

        return maxsum;
    }

        
 
    public static void main(String[] args) {
        int[] arr= {100, 200, 300, 400,500, 1200, 60, 84};
        int k = 2;
        int nas = maxSubarraySum(arr, k);
        System.out.println(nas);
    }
}
