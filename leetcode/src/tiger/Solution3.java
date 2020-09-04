package tiger;

/**
 * @Author: xhh
 * @Date: 2020/8/31 19:56
 * @Version 1.0
 */
public class Solution3 {

    public int question (int a, int b) {
        // write code here

        int res = 0;
        int[] c = new int[1024];
        int[] d = new int[1024];
        int n = 0;
        int m = 0;
        boolean flag = false;
        for (int i = 0; i <= 500; i++) {
            int k  = i + a;

            for (int j = 0; j < k; j++) {
                if ((j * j) == k) {
                    c[n++] = j;
                }
            }
            k = i + b;
            for (int j = 0; j < k; j++) {
                d[m++] = j;
            }
            for (int j = 0; j < n; j++) {
                if (flag) {
                    break;
                }
                for (int l = 0; l < m; l++) {
                    if (c[i] == d[l]) {
                        res = c[i];
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
        }

        return res;

    }

}
