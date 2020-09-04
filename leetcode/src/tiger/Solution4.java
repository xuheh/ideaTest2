package tiger;

/**
 * @Author: xhh
 * @Date: 2020/8/31 21:16
 * @Version 1.0
 */
public class Solution4 {

    public static void main(String[] args) {
        translateNum(12158);
    }

    public static int translateNum (int num) {

        String str = String.valueOf(num);
        int res = 0;
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (l == str.length()) {
                res++;
            }
            for (int k = i; k < str.length(); k++) {
                Character character = new Character((char) (97+j));
                System.out.println(character);
            }

        }
        return res;
        // write code here
    }

}
