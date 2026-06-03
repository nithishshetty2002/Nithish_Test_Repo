public class BubbleSort_TestFail {
    public int[] sort(int[] arr) {
        int n = arr.length;

        // BUG: only one outer pass, so many arrays stay partially unsorted
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
