//Find thew number with the even number of digit count
public class LC1295 {
    public static int digitCount(int x){
        int count = 0;
        while(x != 0){
            x = x /10;
            count ++;
        }
        return count;
    }

    public static int even(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(digitCount(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};

        int numberEven = even(arr);

        System.out.println("The total number of numbers that have even digit is :"
         + numberEven);
    }
}
