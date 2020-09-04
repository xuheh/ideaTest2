package array;

/**
 * @Author: xhh
 * @Date: 2020/7/18 9:31
 * @Version 1.0
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int n, int target) {

        // 确定范围，是在[l,r]的闭区间内寻找target
//        int l = 0, r = n - 1;
//        while (l <= r) {
//
//            int mid = (l+r) / 2;
//            // 如果中间的值和目标值一样的话，则返回mid的下标
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (arr[mid] < target) {
//                l = mid + 1;
//            }
//            else {
//                r = mid-1;
//            }
//
//        }
        // 确定范围，是在[l,r)的区间内寻找target
        int l = 0, r = n;
        // while的条件不能是小于等于了，因为当l == r的时候，区间是没有值的
        while (l < r) {
            // 如果是单纯的l+r的话则可能会超出int类型的最大值，从而报错。
            int mid = l + (r - l) / 2;
            // 如果中间的值和目标值一样的话，则返回mid的下标
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid;
            }

        }
        // 跳出循环还是没有找到相等的值，返回-1
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int result = binarySearch(arr, 5, 7);
        System.out.println(result);

    }

}
