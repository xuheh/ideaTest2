package sort;

import java.util.Arrays;

/**
 * @Author: xhh
 * @Date: 2020/7/31 9:53
 * @Version 1.0
 */
public class QuickSort {

    public static void quickSort(int[] nums, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int p = partition(nums, startIndex, endIndex);
        quickSort(nums, startIndex, p-1);
        quickSort(nums, p + 1, endIndex);
    }

    private static int partition(int[] nums, int startIndex, int endIndex) {

        int p = nums[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right) {

            while (left < right && nums[right] >= p) {
                right--;
            }

            while (left < right && nums[left] <= p) {
                left++;
            }

            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }

        }
        int tmp = nums[startIndex];
        nums[startIndex] = nums[left];
        nums[left] = tmp;
        System.out.println(Arrays.toString(nums));

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {65, 56, 72, 99, 86, 25, 34, 66};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
//        for (int i : arr) {
//            System.out.println(i);
//        }
    }

}
