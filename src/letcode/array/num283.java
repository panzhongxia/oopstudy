package letcode.array;

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class num283 {
    public static void main(String[] args) {
        int[] input = {1,2,4,0,0,5,6};
        int[] output = moveZeroes(input);
        int length = output.length;
        for (int i = 0; i < length; i++) {
            System.out.println(output[i]);
        }
    }
    public static int[] moveZeroes(int[] nums){
        int j = 0;
        for(int i=0; i<nums.length; i++){
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
