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
        int result = removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(result);
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

    public int removeDuplicates1 (int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
    //leetcode.cn/problems/remove-duplicates-from-sorted-array/solutions/575549/shua-chuan-lc-jian-ji-shuang-zhi-zhen-ji-2eg8/

    public int removeDuplicates2 (int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
    //leetcode.cn/problems/remove-duplicates-from-sorted-array/solutions/34033/shuang-zhi-zhen-shan-chu-zhong-fu-xiang-dai-you-hu/

//    public static int removeDuplicates1(int[] nums) {
//        int n = nums.length;
//        if (n <= 1) return n;
//        return process(nums, 1, nums[n - 1]);
//    }
//    public static int process(int[] nums, int k, int max) {
//        int idx = 0;
//        for (int x : nums) {
//            if (idx < k || nums[idx - k] != x) {
//                nums[idx++] = x;
//            }
//            if (idx - k >= 0 && nums[idx - k] == max) break;
//        }
//        return idx;
//    }

}
