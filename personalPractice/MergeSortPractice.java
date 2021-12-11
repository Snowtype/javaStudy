package personalPractice;

public class MergeSortPractice {

    //field : a variable inside a class,
//    private static int[] arr = {10, 7, 1, 5, 3, 9, 8, 4, 6, 2};

    private static int[] arr = {8, 7, 6, 4, 10, 1, 9, 5, 3, 2};

    private static int[] tmp2 = new int[arr.length];

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        int[] tmp = new int[arr.length];


        //mergeSort(arr, tmp, 0, arr.length - 1);
        mergeSort2(arr, tmp2,  0, arr.length - 1);
        for (int data : tmp2) {
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

        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int idx = start;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                tmp[idx] = arr[left];
                left++;
            } else {
                tmp[idx] = arr[right];
                right++;
            }
            idx++;
        }

        if(left <= mid) for (int i = left; i <= mid; i++) tmp[idx++] = arr[i];
        else for(int i = right; i <= end; i++) tmp[idx++] = arr[i];
//        for (int i = 0; i < mid - left; i++) {
//            arr[idx + i] = tmp[left + i];
//        }

        for(int i=start; i<=end; i++) arr[i] = tmp[i];
    }


//-----------------------2------------------------

    public static void mergeSort2(int[] arr, int[] tmp2, int start, int end) {
        if(start<end) {
            int mid = (start + end) / 2;
            mergeSort2(arr, tmp2, start, mid);
            mergeSort2(arr,  tmp2,mid + 1, end);
            merge2(arr, start, end);
        }
    }


    public static void merge2(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int idx = start;

        while (left <= mid && right <= end) {
            if(arr[left] < arr[right]){
                tmp2[idx++] = arr[left++];
            } else {
                tmp2[idx++] = arr[right++];
            }
        }


        if(left <= mid) for(int i=left; i<=mid; i++) tmp2[idx++] = arr[i];
        else for (int i = right; i <= end; i++) tmp2[idx++] = arr[i];

        for(int i=start; i<=end; i++) arr[i] = tmp2[i];

    }
}
