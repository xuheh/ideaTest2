package wyms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: xhh
 * @Date: 2020/8/8 15:03
 * @Version 1.0
 */
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }



        System.out.println(Arrays.toString(nums));

    }

}
