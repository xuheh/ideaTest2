package sort;

import java.util.Arrays;

/**
 * @Author: xhh
 * @Date: 2020/9/13 19:19
 * @Version 1.0
 */
public class BubbleSort {

    public static void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,7,3,6,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

}
