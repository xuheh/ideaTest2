package array.长度最小的子数组209;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
class Solution {
    public static int minSubArrayLen(int s, int[] nums) {

        // nums[l, r]是滑动窗口，也就是要求值的答案
        int l = 0, r = -1, sum = 0, result = nums.length + 1;
        while (l < nums.length) {
            // 保证数组不会越界
            if (r+1 < nums.length && sum < s) {
                r++;
                sum += nums[r];
            }
            else if (sum >= s) {
                sum -= nums[l];
                l++;
            }

            if (sum >= s) {
                result = Math.min(result, r - l + 1);
            }

        }
        if ( result == nums.length + 1) {
            return 0;
        }
        return result;

    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int s = 7;
        minSubArrayLen(s, arr);

    }

}