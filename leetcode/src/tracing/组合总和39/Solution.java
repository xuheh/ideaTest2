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

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates.length <= 0) {
            return res;
        }
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }

    private void dfs(int[] candidates, int target, int begin, ArrayList<Integer> integers) {

        if (target == 0) {
            res.add(new ArrayList<>(integers));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {

            // 剪枝
            if (target < candidates[i]) {
                break;
            }
            integers.add(candidates[i]);
            dfs(candidates, target - candidates[i] , i, integers);
            integers.remove(integers.size() - 1);


        }

    }

}
