package 有效的括号20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: xhh
 * @Date: 2020/2/22 10:36
 * @Version 1.0
 */
public class Solution {

    public boolean isValid(String s) {

        if (s ==""){
            return true;
        }
        if (s.length() ==1) {
            return false;
        }



        HashMap<Character,Character> map = new HashMap();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c==('}') || c==(')') ||c==(']')){
                // 如果匹配到右边的符号但是栈为空的话，则直接false
                if (stack.empty()){
                    return false;
                }
                char pop = stack.pop();
                char s1 = map.get(pop);
                if (s1!=c){
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;

    }

}
