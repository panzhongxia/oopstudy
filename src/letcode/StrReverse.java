package letcode;
import java.util.Scanner;
class StrReverse{
    public String stringReverse(String input) {
        StringBuilder builder = new StringBuilder(input.length());
        for(int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrReverse demo = new StrReverse();
        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(demo.stringReverse(input));
        }
        scanner.close();
    }
}