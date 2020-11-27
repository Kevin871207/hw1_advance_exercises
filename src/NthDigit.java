import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();
        System.out.println(findNthDigit(userInput));
    }

    public static int findNthDigit(int n) {
        long start = 1, count = 1, num = 9;
        while (n > num * count) {
            n -= num * count;
            count += 1;
            start *= 10;
            num *= 10;
        }
        start += (n-1) / count;
        String result = start + "";
        long index = (n-1) % count;
        System.out.println(start);
        System.out.println(index);
        return result.charAt((int)index)-'0';
    }
}
