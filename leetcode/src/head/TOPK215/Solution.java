package head.TOPK215;

/**
 * @Author: xhh
 * @Date: 2020/9/7 19:15
 * @Version 1.0
 */
public class Solution {


    public int findKthLargest(int[] nums, int k) {

        for (int i = 0; i < k - 1; i++) {
            buildMaxHeap(nums, nums.length - i);
            swap(nums, 0, nums.length - 1 - i);
        }

        return nums[0];

    }

    private void buildMaxHeap(int[] nums, int length) {

        for (int i = (length - 2) / 2; i >= 0 ; i--) {
            int parentIndex = i;
            int childrenIndex = (parentIndex * 2)+1;

            while (childrenIndex < length ) {

                if (childrenIndex+1 < length && nums[childrenIndex + 1] > nums[childrenIndex]) {
                    childrenIndex++;
                }
                if (nums[parentIndex] > nums[childrenIndex]) {
                    break;
                }
                swap(nums, parentIndex, childrenIndex);
                parentIndex = childrenIndex;
                childrenIndex = (childrenIndex * 2) + 1;

            }


        }

    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



}
