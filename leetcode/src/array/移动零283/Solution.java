package array.移动零283;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @Author: xhh
 * @Date: 2020/7/18 9:55
 * @Version 1.0
 */
public class Solution {

    /**
     * 思路一：创建一个新的数组，存储原数组的非零数，然后剩余的位置直接补0.
     * @param nums
     * 思路二：创建一个指针，指针之前的的数据都是非0的数据
     * 思路三：创建
     */

//    public void moveZeroes(int[] nums) {
//
//        int[] noZero = new int[nums.length];
//        int j = 0;
//        // 将非0的数组移动到一个新的数组中
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                noZero[j] = nums[i];
//                j++;
//            }
//        }
//
//        for (int i = 0; i < noZero.length; i++) {
//            nums[i] = noZero[i];
//        }
//
//        for (int i = noZero.length; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//
//    }
    public void moveZeroes(int[] nums) {

        int j = 0;
        // 将非0的数按照顺序存储到nums数组中
        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }



    }

}
