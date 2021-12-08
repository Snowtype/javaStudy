package personalPractice;

public class MergeSortPractice {

    //field : a variable inside a class,
    private static int[] arr = {10, 7, 1, 5, 3, 9, 8, 4, 6, 2};



    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);

        for (int data : tmp) {
            sb.append(data + ", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        System.out.println(sb);
    }

    public static void mergeSort(int[] arr, int[] tmp, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp,start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, end);
        }
    }

    public static void merge(int[] arr, int[] tmp, int start, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int idx = start;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                arr[idx] = tmp[left];
                left++;
            } else {
                arr[idx] = tmp[right];
                right++;
            }
            idx++;
        }

        if(left <= mid) for (int i = left; i <= mid; i++) arr[idx++] = tmp[i];
        else for(int i = right; i <= end; i++) arr[idx++] = tmp[i];
//        for (int i = 0; i < mid - left; i++) {
//            arr[idx + i] = tmp[left + i];
//        }

    }
}
