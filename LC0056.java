import java.util.Arrays;

public class LC0056 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int index=0;
        int row = intervals.length;
        int[][] res = new int[row][2];
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 1; i < row; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if(end1 >= start2){
                start1 = start1;
                end1 = Math.max(end1,end2);
                continue;
            }
            res[index][0] = start1;
            res[index][1] = end1;
            start1 = start2;
            end1 = end2;
            index++;
        }
        res[index][0] = start1;
        res[index][1] = end1;
        return Arrays.copyOf(res, index + 1);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,20}};
        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
