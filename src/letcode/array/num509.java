package letcode.array;

import java.util.Scanner;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 */
public class num509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input  = scanner.nextInt();
        int res = fib(input);
        System.out.println(res);
    }

    //1.暴力递归
    //时间复杂度：O(2^N)
    //空间复杂度：O(1)

//    public static int fib(int n) {
//        // base case
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        // 递推关系
//        return fib(n - 1) + fib(n - 2);
//    }

    //2.带备忘录的递归解法
    //时间复杂度：O(N)
    //空间复杂度：O(N)

//    public static int fib(int n) {
//        // 备忘录全部初始化为0
//        int[] memo = new int[n + 1];
//        // 进行带备忘录的递归
//        return helper(memo, n);
//    }
//
//    private static int helper(int[] memo, int n) {
//        // base case
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        // 进行检查，已经计算过就不用在计算了
//        if (memo[n] != 0) {
//            return memo[n];
//        }
//        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
//        return memo[n];
//    }

    //3.使用 dp 数组的动态规划方法
    //时间复杂度：O(N)
    //空间复杂度：O(N)

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        // base case
        dp[0] = 0; dp[1] = 1;
        // 状态转移
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //4.滚动数组，优化空间复杂度
    //时间复杂度：O(N)
    //空间复杂度：O(1)

//    public static int fib(int n) {
//        if (n < 2) {
//            return n;
//        }
//        int p = 0, q = 0, r = 1;
//        for (int i = 2; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = p + q;
//        }
//        return r;
//    }


}
