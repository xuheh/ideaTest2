package 电话号码的字母组合17;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/2/20 20:15
 * @Version 1.0
 */
class Solution {
    static LinkedList<String> resList = new LinkedList<>();

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
        if(! "".equals(digits)) {
            backtrace(0, digits, new StringBuilder(), resList);
        }
        return resList;
    }

    private static void backtrace(int i, String digits, StringBuilder stringBuilder, LinkedList<String> resList) {
        // 回溯
        if (stringBuilder.length()==digits.length()){
            resList.add(stringBuilder.toString());
            return;
        }
        char c = digits.charAt(i);
        String letters = letterMap[c - '0'];  // 获取第i位数字对应的各个字母
        for (int j = 0; j < letters.length(); j++) {
            stringBuilder.append(letters.charAt(j));
            backtrace(i+1, digits, stringBuilder, resList);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }

    public static void main(String[] args){
        System.out.println(letterCombinations("234"));
    }
}


