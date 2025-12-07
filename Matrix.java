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
                matrix[i][j] = (int)(Math.random() * 101); // 0–100;
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
}
