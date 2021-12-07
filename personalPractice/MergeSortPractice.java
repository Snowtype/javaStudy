package personalPractice;

public class MergeSortPractice {

    //field : a variable inside a class,
    private static int[] arr = {10, 7, 1, 5, 3, 9, 8, 4, 6, 2};
    private static int[] sorted = new int[10];

    public static void main(String[] args) {

        int i = 0;
        int j = arr.length / 2; // middle + 1
        int k = i; // index


        while (i <= j - 1 && j <= arr.length - 1) {
            if (j >)
        }

        System.out.println(7 / 2);
    }

    public static void mergeSort(int) {

    }

    public static void merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int idx = start;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                sorted[idx] = arr[left];
                idx
            }
        }

    }
}
