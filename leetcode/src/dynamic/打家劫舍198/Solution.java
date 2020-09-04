package dynamic.打家劫舍198;

import org.junit.Test;

/**
 * @Author: xhh
 * @Date: 2020/7/30 19:37
 * @Version 1.0
 */
public class Solution {



    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }


//    private int tryRob(int[] nums, int index) {
//
//        if (index >= nums.length) {
//            return 0;
//        }
//
//        if (memo[index] !=0) {
//            return memo[index];
//        }
//
//        int res = 0;
//
//        for (int i = index; i < nums.length; i++) {
//
//            res = Math.max(res, nums[i] + tryRob(nums, i + 2));
//
//        }
//        memo[index] = res;
//        return res;
//    }

    @Test
    public void test() {

        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));

    }

}
