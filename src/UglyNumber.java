import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();
        System.out.println(findUglyNumber(userInput));
    }

    public static boolean findUglyNumber(int n) {
        if (n < 0) {
            return false;
        } else {
            while (n % 2 == 0){
                n /= 2;
            }
            while (n % 3 == 0){
                n /= 3;
            }
            while (n % 5 == 0){
                n /= 5;
            }
            if(n == 1){
                return  true;
            }else {
                return false;
            }
        }
    }
}
