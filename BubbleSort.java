import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("Sorted array :   " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop to compare adjacent elements
            // (n - i - 1) ensures we don't re-check already sorted elements at the end
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // Mark that a swap happened
                }
            }
            
            // Optimization: If no elements were swapped, the array is already sorted!
            if (!swapped) {
                break;
            }
        }
    }
}
