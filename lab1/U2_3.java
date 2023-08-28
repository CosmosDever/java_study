package java_study.lab1;

public class U2_3 {
    public static void main(String[] args) {
        // Find the length of arrays
        int[] a1 = new int[10];
        int[] a2 = { 3, 5, 7, 1, 8, 99, 44, -10 };
        int[] a3 = { 4, 3, 2, 1 };
        
        System.out.println("Length of a1: " + a1.length);
        System.out.println("Length of a2: " + a2.length);
        System.out.println("Length of a3: " + a3.length);

        // Demonstrate a two-dimensional array
        int[][] matrix = new int[3][3];
        int value = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }
        
        System.out.println("\nTwo-dimensional array (3x3 matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
