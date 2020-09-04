package tiger;

import java.util.ArrayList;

/**
 * @Author: xhh
 * @Date: 2020/8/31 19:55
 * @Version 1.0
 */
public class Solution2 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        res.add("a");
        res.add("adb");
        res.add("gae");
        res.add("ddd");
        res.add("you");
        res.add("better");
        values.add(res);
        ArrayList<String> res1 = new ArrayList<>();
        res1.add("aa");
        res1.add("adbd");
        res1.add("gaew");
        res1.add("ddda");
        res1.add("you");
        res1.add("better");


        values.add(res1);
        ArrayList<String> res2 = new ArrayList<>();

        res2.add("aa");
        res2.add("adbda");
        res2.add("gaewa");
        res2.add("dddaa");
        res2.add("you");
        res2.add("better");
        values.add(res2);
        System.out.println(findCommonString(values));
    }

    /**
     *
     * @param values string字符串ArrayList<ArrayList<>>
     * @return string字符串ArrayList
     */
    public static ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> firstValues = values.get(0);
        boolean flag = false;
        int l = values.size() - 1;
        for (int i = 0; i < firstValues.size(); i++) {
            String str = firstValues.get(i);
            int h = 0;
            for (int j = 1; j < values.size(); j++) {

                for (int k = 0; k < values.get(j).size(); k++) {
                    if (values.get(j).get(k).equals(str) ) {
                        h++;
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    break;
                }
                else {
                    flag = false;
                }
                if ( l==h ) {
                    res.add(str);
                }
            }
        }
        return res;

    }

}
