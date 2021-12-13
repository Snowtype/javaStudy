package personalPractice;

import java.util.*;

public class SelectionSortPractice {

    static int idxMin=0;
    static int tmp = 0;


    public static void main(String[] args) {

        int[] arr = {10, 9, 3, 5};

        selectionSort(arr);


    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            idxMin = i;

            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < arr[idxMin]) {
                    idxMin = j;
                }

            }

            tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
