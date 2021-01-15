package letcode;

import java.util.Scanner;

public class ReverseSentence {
    public String reverse(String sentence) {
        String[] str = sentence.trim().split(" ");
        String result = "";
        int start = 0;
        int end = str.length - 1;
        while(start < end) {
            String t = str[start];
            str[start] = str[end];
            str[end] = t;
            start++;
            end--;
        }
        for(String t : str){
            result += t;
            result +=" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseSentence demo = new ReverseSentence();
        while (scanner.hasNext()) {
            String input  = scanner.nextLine();
            System.out.println(demo.reverse(input));
        }

        scanner.close();
    }
}
