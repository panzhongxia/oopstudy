package letcode.array;

import java.util.List;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 链接：https://leetcode-cn.com/problems/rotate-array
 */
public class num189 {
    public static void main(String[] args) {
        int[] nums = {-10,1,2,8,9,10,11};
        int[] ans = rotate(nums,3);
        //int n = nums.length;
        //int[] newArr = new int[n];
        //System.arraycopy(nums, 3, newArr, 0, n+3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        //System.arraycopy(newArr, 0, nums, 0, n);
        return newArr;
    }

    public static int[] rotate2(int[] nums, int k) {
        // 拷贝一份数组
        int[] temp = nums.clone();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[ (i + k) % len ] = temp[i];
        }
        return nums;
    }

    public static  int[] rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

}
