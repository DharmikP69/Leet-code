public class LC1186 {
    public static  int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            
            nodelete = Math.max(nodelete + arr[i],arr[i]);

            int v1;

            if(prevonedelete == Integer.MIN_VALUE){
                v1 = arr[i];
            } else {
                v1 = prevonedelete + arr[i];
            }

            onedelete = Math.max(v1,prevnodelete);

            result = Math.max(result,Math.max(onedelete,nodelete));
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,0,3};
        int nas = maximumSum(arr);
        System.out.println(nas);
    }
}
