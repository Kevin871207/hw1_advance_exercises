import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userInput = myObj.nextLine();

        lengthOfLastWord(userInput);
    }

    public static void lengthOfLastWord(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.charAt(i)== ' ') {
                ans = 0;
                for(int j = i+1; j < str.length(); j++){
                    if(str.charAt(j) != ' '){
                        ans++;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
