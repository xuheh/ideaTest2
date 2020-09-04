package 最接近的三数之和16;

import java.util.Arrays;

/**
 * @Author: xhh
 * @Date: 2020/2/18 19:11
 * @Version 1.0
 */
public class Solution  {
    public int threeSumClosest(int[] nums, int target) {

        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while (left <right){
                int sum = nums[left] + nums[right] + nums[i];
                if (Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }

                if (sum > target){
                    right--;
                }
                else if (sum< target){
                    left++;
                }
                else {
                    return ans;
                }
            }
        }

        return ans;
    }
}
