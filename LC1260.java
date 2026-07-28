import java.util.ArrayList;
import java.util.List;

public class LC1260 {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int sz = row * col;

        k = k % sz;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                temp.add(0);
            }
            ans.add(temp);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int newIndex = (i * col + j + k) % sz;
                int newRow = (newIndex / col) % row;
                int newCol = newIndex % col;

                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 1;
        List<List<Integer>> ans = shiftGrid(grid, k);
        System.out.println(ans);
    }
}
