package tracing.电话号码的组合17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/7/23 15:24
 * @Version 1.0
 */
public class Solution {

    static List<String> res = new ArrayList<>();

    private static String letterMap[] = {
            "",     //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public static List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return res;
        }
        dfs(0, digits, new StringBuilder());
        return res;
    }

    private static void dfs(int index, String digits, StringBuilder stringBuilder) {

        if (stringBuilder.length() == digits.length()) {
            res.add(stringBuilder.toString());

            return;
        }
        char c = digits.charAt(index);

        String letter = letterMap[Integer.parseInt(String.valueOf(c))];


        for (int i = 0; i < letter.length(); i++) {

            stringBuilder.append(letter.charAt(i));
            dfs(index+1, digits, stringBuilder);
            // 递归完成后，删除最后一个字母
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }

    public static void main(String[] args){
        System.out.println(letterCombinations(""));
    }

}
