package personalPractice;

public class MergeSortPractice {

    //field : a variable inside a class,
    private static int[] arr = {10, 7, 1, 5, 3, 9, 8, 4, 6, 2};
    private static int[] sorted = new int[10];

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();


        mergeSort(arr,0,arr.length-1);

        for (int data : sorted) {
            sb.append(data + ", ");
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1, end);
            merge(arr,start,end);
        }
    }

    public static void merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int idx = start;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                sorted[idx] = arr[left];
                left++;
            } else {
                sorted[idx] = arr[right];
                right++;
            }
            idx++;
        }

        for (int i = 0; i < mid - left; i++) {
            sorted[idx + i] = arr[left + i];
        }



    }
}
