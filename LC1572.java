public class LC1572 {
    public static int diagonalsum(int[][] mat) {

        int sum = 0;
        // int n = mat.length;

        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
            sum = sum + mat[i][mat.length - 1 - i];
        }

        if (mat.length % 2 != 0) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int answer = diagonalsum(matrix);
        System.out.println("Sum of the diagonal element is : " + answer);
    }
}