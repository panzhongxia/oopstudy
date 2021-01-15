package letcode;

import java.util.Scanner;

public class Binary_conversion {
    public static String binary(int n,int b) {
        if(n<b) {
            if(n<10)
                return String.valueOf(n);
            else if(10==n)
                return "A";
            else if(11==n)
                return "B";
            else if(12==n)
                return "C";
            else if(13==n)
                return "D";
            else if(14==n)
                return "E";
            else
                return "F";
        }
        else {
            if((n%b)<10)
                return binary(n/b,b).concat(String.valueOf(n%b));
            if((n%b)==10)
                return binary(n/b,b).concat("A");
            else if((n%b)==11)
                return binary(n/b,b).concat("B");
            else if((n%b)==12)
                return binary(n/b,b).concat("C");
            else if((n%b)==13)
                return binary(n/b,b).concat("D");
            else if((n%b)==14)
                return binary(n/b,b).concat("E");
            else
                return binary(n/b,b).concat("F");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("请输入n的值：");
        int n=sc.nextInt();
        System.out.println("请输入要转换的进制（2-15）");
        System.out.println("提示：您需要输入一个正确的数字，若不正确，则重新输入！");
        int b;
        do {
            b=sc.nextInt();
        }while(b<=1||b>16);
        sc.close();
        System.out.printf(n+"的"+b+"进制为："+binary(n,b));
    }
}
