package tracing.组合总和39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/7/26 14:33
 * @Version 1.0
 */
public class Solution {


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length <= 0) {
            return res;
        }
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private static void backtrack(int[] candidates, int target, int index, ArrayList<Integer> integers, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(integers));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // 剪枝
            if (target < candidates[i]) {
                break;
            }
            target -= candidates[i];
            integers.add(candidates[i]);
            backtrack(candidates, target, i , integers, res);
            integers.remove(integers.size() - 1);
        }


    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        System.out.println(combinationSum(nums, 7));
    }


}
