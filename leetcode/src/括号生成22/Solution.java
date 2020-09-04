package 括号生成22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/2/22 11:57
 * @Version 1.0
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, new StringBuilder(""), 0, 0, n);
        return res;
    }

    public void dfs(List<String> resultList, StringBuilder str, int open, int close, int max) {

        if (str.length()== max *2){
            resultList.add(str.toString());
            return;
        }

        if (open < max){
            dfs(resultList, str.append("("), open+1, close, max);
        }

        if (close < open){
            dfs(resultList, str.append(")"), open, close+1, max);
        }

    }

}
