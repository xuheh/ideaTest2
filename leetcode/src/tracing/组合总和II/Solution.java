package tracing.组合总和II;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/7/26 12:32
 * @Version 1.0
 */
public class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if ( candidates.length < 0) {
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> sums = new ArrayList<>();
        dfs(candidates, target, 0, sums);

        return res;

    }

    private void dfs(int[] candidates, int target, int begin, List<Integer> sums ) {

        if ( target  == 0) {
            // 重要
            res.add(new ArrayList<>(sums));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {

            if ( target - candidates[i] < 0  ) {
                break;
            }
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }

            sums.add(candidates[i]);

            dfs(candidates, target - candidates[i], i+1, sums);

            sums.remove(sums.size() - 1);

        }

    }

    @Test
    public void test(){
        int[] c = {10,1,2,7,6,1,5};
//        System.out.println(new HashSet<>(combinationSum2(c, 8)));
        System.out.println(combinationSum2(c, 8));
    }

}
