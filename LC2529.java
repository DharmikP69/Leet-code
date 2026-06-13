public class LC2529 {
    public static int maximumCOunt(int[] nums){
        int Pcount = 0, Ncount = 0;
        for (int num : nums) {
            if(num > 0) Pcount++;
            else if (num < 0)Ncount++;
        }
        return Math.max(Pcount,Ncount);
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        int ans = maximumCOunt(arr);
        System.out.println(ans);
    }
}
