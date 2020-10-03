package tracing.子集78;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * @Author: xhh
 * @Date: 2020/10/2 18:25
 * @Version 1.0
 */
public class Solution {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        if (nums.length == 0) {
            return res;
        }
        backtrack(nums, 0, new ArrayList<Integer>() , res);

        return res;
    }

    private static void backtrack(int[] nums, int index,List<Integer> sub ,List<List<Integer>> res) {

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]) {
                continue;
            }
            sub.add(nums[i]);
            res.add(new ArrayList<>(sub));
            backtrack(nums, i + 1, sub, res);
            sub.remove(sub.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));

    }

}
