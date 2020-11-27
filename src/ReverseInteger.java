import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();
        System.out.println(reverseInteger(userInput));
    }

    public static int reverseInteger(String str) {
        String result = "";
        if (str.charAt(0) == '-') {
            result += '-';
            for (int i = str.length() - 1; i > 0; i--) {
                result += str.charAt(i);
            }
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
        }
        long temp = Long.parseLong(result);
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(result);
        }
    }
}
