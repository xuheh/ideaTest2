package head;

import java.util.Arrays;

/**
 * @Author: xhh
 * @Date: 2020/7/31 12:20
 * @Version 1.0
 */
public class HeadSort {

    // 节点下沉
    public static void downAdjust(int arr[], int parentIndex, int length){

        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 获取最小的一个子树
            if (childIndex+1 < length && arr[childIndex+1] < arr[childIndex]) {
                childIndex++;
            }

            if (arr[childIndex] >= temp ) {
                break;
            }

            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;

        }
        arr[parentIndex] = temp;

    }

    public static void headSort(int arr[]) {

        // 构建堆
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downAdjust(arr, i, arr.length);
        }

        for (int i = arr.length-1; i > 0 ; i--) {

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downAdjust(arr, 0, i);

        }

    }

    public static void main(String[] args){

        int[] arr = new int[]{5, 2, 6};
        headSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
