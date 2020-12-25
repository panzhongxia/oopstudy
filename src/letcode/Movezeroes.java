package letcode;

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class Movezeroes {
    public int[] moveZeroes(int[] nums){
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}
