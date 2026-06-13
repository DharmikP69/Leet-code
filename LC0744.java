public class LC0744 {
    public static char nextGreatestLetter(char[] nums, char target){
        int start = 0;
        int end = nums.length -1 ;

        while (start <= end){
            int mid = start + ( end - start ) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return nums[start % nums.length];
    }
    public static void main(String[] args) {
        char[] str = {'c','f','j'};
        char target = 'b'; 

        char ans = nextGreatestLetter(str, target);
        System.out.println(ans);
    }
}
