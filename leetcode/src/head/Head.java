package head;

import java.util.Arrays;

/**
 * @Author: xhh
 * @Date: 2020/7/31 11:13
 * @Version 1.0
 */
public class Head {

    /**
     * 构造最大堆。
     * @param arr
     * @param parentIndex
     * @param length
     */
    public static void downAdjust(int arr[], int parentIndex, int length){

        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex <= length) {
            // 获取最小的一个子树
            if (childIndex+1 <= length && arr[childIndex+1] < arr[childIndex]) {
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

    public static void buildHeap(int arr[]) {
        for (int i = (arr.length -2) / 2; i>=0; i--) {
            downAdjust(arr, i , arr.length -1);
        }
    }

    public static void main(String[] args){
        int arr[] = new int[] {7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(6<9);
    }

}
