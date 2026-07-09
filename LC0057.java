import java.util.ArrayList;

public class LC0057 {

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        list.add(newInterval);

        while (i < n) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};

        int[][] ans = insert(intervals, newInterval);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}