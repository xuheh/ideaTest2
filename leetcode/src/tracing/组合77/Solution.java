package tracing.组合77;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/7/24 18:44
 * @Version 1.0
 */
public class Solution {

    static  List<List<Integer>> res = new ArrayList<>();


    public static List<List<Integer>> combine(int n, int k) {

        if ( n<=0 || k<=0 || k>n ) {
            return res;
        }

        dfs( n, k, 1, new ArrayList<Integer>());

        return res;
    }

    private static void dfs(int n, int k, int start, ArrayList<Integer> integers) {

        if (integers.size() == k) {
            res.add(new ArrayList<>(integers));
            return;
        }

        for (int i = start; i <= n; i++) {

            integers.add(i);
            dfs( n, k, i + 1, integers);
            integers.remove(integers.size() - 1);

        }

    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}
