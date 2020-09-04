package tiger;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reOrderArray(new int[]{1, 2, 3, 4})));
    }

    /**
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public static int[] reOrderArray (int[] array) {

        int[] ji = new int[array.length];
        int[] ou = new int[array.length + 1 / 2];
        int j = 0;
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ou[z++] = array[i];
            }
            else {
                ji[j++] = array[i];
            }
        }
        int k = 0;
        for (int i = j ; i < array.length; i++) {
            ji[i] = ou[k++] ;
        }

        return ji;
    }
}