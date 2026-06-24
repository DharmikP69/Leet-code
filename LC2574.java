public class LC2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int totalsum = 0; 
        for (int num : nums) {
            totalsum = totalsum + num;
        }

        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            answer[i] = Math.abs(leftsum - rightsum);

            leftsum = leftsum + nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int[] nas = leftRightDifference(arr);
        for (int num : nas) {
            System.out.print(num + " ");
        }
    }
}
