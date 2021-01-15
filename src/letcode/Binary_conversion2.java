package letcode;
import java.util.*;
public class Binary_conversion2 {
    // 因为要考虑到 余数 > 9 的情况，2<=N<=16.
    public static final String[] F = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve (int M, int N) {
        //要考虑 M 为负数的情况
        Boolean flag = false;
        if(M < 0) {
            flag = true;
            M *= -1;
        }
        StringBuffer sb = new StringBuffer();
        int temp;
        while(M != 0) {
            temp = M % N;
            sb.append(F[temp]);
            M = M / N;
        }
        // 字符串反转
        sb.reverse();
        String res = (flag ? "-" : "") + sb.toString();
        return res;
    }
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n=sc.nextInt();
        System.out.println("请输入要转换的进制（2-15）");
        int b=sc.nextInt();
        sc.close();
        Binary_conversion2 nb = new Binary_conversion2();
        System.out.println(nb.solve(n,b));
    }
}