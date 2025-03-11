package letcode.array;

/**
 * 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
 * 垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 *
 */
public class num11 {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5,6};
        int ans = maxArea(height);
        System.out.println(ans);
    }

//    public static int maxArea(int[] height) {
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int area = (j - i) * Math.min(height[j], height[i]);
//                max = Math.max(max, area);
//            }
//        }
//        return max;
//    }

    public static int maxArea(int[] height) {
        int max = 0;
        for(int i = 0, j = height.length -1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i ++] : height[j --];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }


//    public static int maxArea(int[] height) {
//        int l = 0, r = height.length - 1;
//        int ans = 0;
//        while (l < r) {
//            int area = Math.min(height[l], height[r]) * (r - l);
//            ans = Math.max(ans, area);
//            if (height[l] <= height[r]) {
//                ++l;
//            }
//            else {
//                --r;
//            }
//        }
//        return ans;
//    }
}
