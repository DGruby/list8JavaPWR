public class Matrix {
    private int columns;
    private int rows;
    private int[][] matrix;


    public Matrix(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 101); // 0–100;
            }
        }
    }

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void transpose() {
        int[][] transposed = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        matrix = transposed;
        rows = transposed.length;
        columns = transposed[0].length;
    }

    public void printSpiral() {
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        while (top <= bottom && left <= right) {

            // 1. left → right (top row)
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // 2. top → bottom (right column)
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // 3. right → left (bottom row)
            if (top <= bottom) { // avoid double printing
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // 4. bottom → top (left column)
            if (left <= right) { // avoid double printing
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
    }
}
