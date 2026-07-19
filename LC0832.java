public class LC0832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;
            while (left <= right) {
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] answer = flipAndInvertImage(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Flip and invert
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
