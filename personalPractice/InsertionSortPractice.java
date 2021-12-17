package personalPractice;


import java.util.LinkedList;
import java.util.List;


public class InsertionSortPractice {
    public static void main(String[] args) {
        int[] nums = {9,2,3,5,7,6,4};


        List<Integer> list = new LinkedList<>();

        loop1: for (Integer num : nums) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > num) {
                    list.add(i, num);
                    continue loop1;
                }
            }
            list.add(num);
        }

        String str = "";
        for (Integer num: list) {
            str = str + num + ", ";
        }

        System.out.println(str.substring(0, str.length()-2));

        StringBuffer sb = new StringBuffer();
        for (Integer num : list) {
            sb.append(num + ", ");
        }

        System.out.println(sb.substring(0, sb.length() - 2));

        int[] arr = {10,9,8,7,0,1};

        arr=insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static int[] insertionSort (int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length-1; j >= 1; j--) {
                if (arr[j-1] > arr[j]) { // 앞의 값이 뒤의 값 보다 크면 서로 바꾸기

                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

}
