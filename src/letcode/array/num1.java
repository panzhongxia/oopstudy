package letcode.array;
/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 链接：https://leetcode-cn.com/problems/two-sum
 */

import java.util.HashMap;
import java.util.Map;

public class num1 {

    public static void main(String[] args) {
        int target = 12;
        int[] nums = {1,9,10,11};
        int[] result = twoSum(target, nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

//    private static int[] twoSum(int target, int[] nums) {
//        if (nums == null) {
//            return new int[]{};
//        }
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len; j++) {
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[] {};
//    }

    public static int[] twoSum(int target, int[] nums) {
        int[] a = new int[2];
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[0];
    }

//    public static int[] twoSum(int target, int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }



}
