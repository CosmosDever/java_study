package java_study.lab1;

public class U2_5 {
    public static void main(String[] args) {
        // Matrix for addition
        int[][] a = {
            {4, 7, 9, 8, 3},
            {2, 4, 7, 8, 1},
            {1, 1, 8, 1, 2},
            {0, 0, 1, 0, 4}
        };
        
        int[][] b = {
            {1, 2, 8, 4, 3},
            {4, 1, 8, 3, 1},
            {2, 1, 0, 0, 5},
            {1, 2, 1, 1, 7}
        };
        
        int rows = a.length;
        int columns = a[0].length;
        
        int[][] resultAddition = new int[rows][columns];
        
        // Matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultAddition[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // Display result of addition
        System.out.println("Matrix Addition:");
        printMatrix(resultAddition);
        
        // Matrix for multiplication
        int[][] c = {
            {1, 2, 3},
            {4, 5, 6},
            {2, 3, 4}
        };
        
        int[][] d = {
            {1, 2, 3},
            {4, 5, 6},
            {2, 3, 4}
        };
        
        int[][] resultMultiplication = new int[c.length][d[0].length];
        
        // Matrix multiplication
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < c[0].length; k++) {
                    sum += c[i][k] * d[k][j];
                }
                resultMultiplication[i][j] = sum;
            }
        }
        
        // Display result of multiplication
        System.out.println("\nMatrix Multiplication:");
        printMatrix(resultMultiplication);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
