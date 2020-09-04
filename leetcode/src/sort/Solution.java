package sort;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    @Test
    public void test() {
        int[] arr = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] sortArray(int[] nums) {
        int length = nums.length - 1;
        for(int i = (length - 1) >> 1; i >= 0; i--){
            heapify(nums, i, length);
        }
        for(int i = length; i > 0; i--){
            swap(nums, 0, i);
            heapify(nums, 0, i - 1 );
        }
        return nums;
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void heapify(int[] nums, int index, int length){
        int left = (index << 1) + 1;
        int right = left + 1;
        int max = index;

        if(left <= length && nums[max] < nums[left])
            max = left;
        if(right <= length && nums[max] < nums[right])
            max = right;
        if(index != max){
            swap(nums, index, max);
            heapify(nums, max, length);
        }
    }
}