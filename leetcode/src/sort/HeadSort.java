package sort;

/**
 * @Author: xhh
 * @Date: 2020/9/13 23:11
 * @Version 1.0
 */
public class HeadSort {

    public static void buildHead(int[] arr, int index, int length) {
        int parentIndex = index;
        int chileIndex = 2 * parentIndex + 1;
        while (chileIndex < length ) {

            if (chileIndex + 1 < length && arr[chileIndex + 1] > arr[chileIndex]) {

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,5,7,3,6,4};
        for (int i = (arr.length - 2) / 2 ; i >=0 ; i--) {
            buildHead(arr, i, arr.length - 1);
        }

    }

}
