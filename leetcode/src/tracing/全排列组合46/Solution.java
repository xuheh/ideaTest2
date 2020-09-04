package tracing.全排列组合46;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/7/24 16:21
 * @Version 1.0
 */
public class Solution {

    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        res.clear();
        int[] visited = new int[nums.length];
        backtrack( nums, new ArrayList<Integer>(), visited);
        return res;

    }

    private static void backtrack(int[] nums, ArrayList<Integer> tmp, int[] visited) {
        if (tmp.size() == nums.length) {
            res.add(tmp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(nums, tmp, visited);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }



}
