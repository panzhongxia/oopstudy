package letcode.array;
/**
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
 */
public class num9 {
    public static void main(String[] args) {
        int target = 12;
        boolean result = isPalindrome(target);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }
    //leetcode.cn/problems/palindrome-number/solutions/7559/hua-jie-suan-fa-9-hui-wen-shu-by-guanpengchn/

}
