public class LC1464 {
    public static int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;

        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            } else if (num > max2){
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        int nas = maxProduct(arr);
        System.out.println(nas);
    }
}
