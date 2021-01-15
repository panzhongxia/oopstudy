package letcode;

import java.util.Scanner;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        for(char ch : s.toCharArray()) {
            String ss=Character.toString(ch);
            System.out.println(s.indexOf(ss));
            String ns = s.substring(s.indexOf(ss)+1);
            System.out.println(ns);
            if(ns.contains(ss)) {
                System.out.println(ss);
                continue;
            }else{
                return s.indexOf(ss);
            }
        }
        return -1;
    }
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n的值：");
        String n=sc.nextLine();
        sc.close();
        FirstUniqChar nb = new FirstUniqChar();
        System.out.println(nb.firstUniqChar(n));
    }
}
