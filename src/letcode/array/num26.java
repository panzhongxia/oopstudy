package letcode.array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 */
public class num26 {

    public static void main(String[] args) {
        int target = 12;
        int[] nums = {1,1,2,2,9,10,11};
        int result = removeDuplicates1(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[++slow] = nums[fast];
            }
            ++fast;
        }
        return slow;
    }

    public static int removeDuplicates1(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        return process(nums, 1, nums[n - 1]);
    }
    public static int process(int[] nums, int k, int max) {
        int idx = 0;
        for (int x : nums) {
            if (idx < k || nums[idx - k] != x) {
                nums[idx++] = x;
            }
            if (idx - k >= 0 && nums[idx - k] == max) break;
        }
        return idx;
    }

}
