package jianzhi;

/**
 * @Author: xhh
 * @Date: 2020/8/22 12:09
 * @Version 1.0
 */
public class 旋转数组的最小数字11 {

    public int minArray(int[] numbers) {

        if (numbers.length <= 0) {
            return -1;
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i+1]) {
                return numbers[i + 1];
            }

        }
        return numbers[0];
    }

}
