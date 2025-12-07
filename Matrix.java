public class Matrix {
    //all fields are mutable, but only through specified getters and setters
    private int columns;
    private int rows;
    private int[][] matrix;


    public Matrix(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        matrix = new int[rows][columns];

        // Two nested loops → O(rows * columns)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 101); // 0–100;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix; // O(1)
    }

    public int getValue(int r, int c) {
        return matrix[r][c]; // O(1)
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int num : row) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void transpose() {
        int[][] transposed = new int[columns][rows];

        // Two nested loops over all elements → O(rows * columns)
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
        // Every matrix element is visited exactly once → O(rows * columns)
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        while (top <= bottom && left <= right) {

            // O(columns)
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // O(rows)
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // O(columns)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // O(rows)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
        // Total still: O(rows * columns)
    }

    public void multiply(Matrix other) {
        if (columns != other.rows) {
            System.out.println("Cannot multiply, dimension mismatch");
            return;
        }

        int[][] result = new int[rows][other.columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                int sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += matrix[i][k] * other.getValue(k, j);
                }
                result[i][j] = sum;
            }
        }

        matrix = result;
        rows = result.length;          // explicitly update rows
        columns = result[0].length;    // explicitly update columns
    }

}

