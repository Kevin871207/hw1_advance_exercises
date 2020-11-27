import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();

        countPrimes(userInput);
    }

    public static void countPrimes(int n) {
        int ans = 0, count;
        for (int i = 2; i < n; i++) {
            count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
