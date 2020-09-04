package tiger;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(getMaxResult("1-2-3-4+5-6"));
    }
    /**
     * 
     * @param expression string字符串 
     * @return int整型
     */


    public static int getMaxResult (String expression) {
        // write code here
        Queue one = new LinkedList<Character>();
        Queue two = new LinkedList<Character>();
        Queue three = new LinkedList<Character>();
        int resOne = 0;
        int resTwo = 0;
        int j = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-') {
                if (i < expression.length() - 2 && expression.charAt( i + 2 ) == '-' || expression.charAt( i - 2 ) == '-'){
                    two.add(expression.charAt( i + 1));
                }
                else if (i == expression.length() - 2 && expression.charAt( i - 2 ) == '-') {
                    two.add(expression.charAt( i + 1));
                }
                else {
                    three.add(expression.charAt(i + 1));
                }
                i++;
            }
            else if (expression.charAt(i) != '+') {
                one.add(expression.charAt(i));
            }
        }

        while (!one.isEmpty()) {
            resOne += Integer.parseInt(String.valueOf(one.poll()));
        }

        while (!two.isEmpty()) {
            if (j == 0 ){
                resTwo += Integer.parseInt(String.valueOf(two.poll()));
                j++;
            }
            else {
                resTwo -= Integer.parseInt(String.valueOf(two.poll()));
            }
        }
        resOne -= resTwo;
        while (!three.isEmpty()) {
            resOne -= Integer.parseInt(String.valueOf(three.poll()));
        }
        return resOne;
    }
}