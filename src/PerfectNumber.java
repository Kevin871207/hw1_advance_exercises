import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();
        findPerfectNumber(userInput);
    }

    public static void findPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
