//Shuffle The Aarray
public class LC1470 {

    public static int[] shuffle(int[] nums, int n){

        int[] result = new int[nums.length];

        int index = 0;

        for(int i = 0; i < n; i++){

            result[index] = nums[i];
            index++;

            result[index] = nums[i + n];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2};

        int n = 2;

        int[] arr2 = shuffle(arr, n);

        System.out.print("Array : ");

        for(int i = 0; i < arr2.length; i++){

            System.out.print(arr2[i] + " ");
        }
    }
}