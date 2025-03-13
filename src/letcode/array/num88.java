package letcode.array;

import java.util.Arrays;

public class num88 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,9,9,10,0,0,0,0};
        int[] nums2 = {3,4,5,11};
        int[] result = merge(nums1, 7, nums2, 4);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(result[i]);
        }
    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            if (nums1[len1] >= nums2[len2]) {
                nums1[len] = nums1[len1];
                len1--;
            } else {
                nums1[len] = nums2[len2];
                len2--;
            }
            len--;
        }
        while (len2 >= 0) {
            nums1[len] = nums2[len2];
            len2--;
            len--;
        }
        return nums1;
    }
    //https://leetcode.cn/problems/merge-sorted-array/solutions/13005/hua-jie-suan-fa-88-he-bing-liang-ge-you-xu-shu-zu-/

    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}

//leetcode.cn/problems/merge-sorted-array/solutions/666608/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/
