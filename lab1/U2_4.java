package java_study.lab1;

public class U2_4 {
    public static void main(String[] args) {
        int[] arr = {234, 6, 846, 85, 96, 198, 545, 12, 60, 34, 4, 87, 7, 1};
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Perform bubble sort
        bubbleSort(arr);
        
        System.out.println("\nArray in ascending order:");
        printArray(arr);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped by inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
