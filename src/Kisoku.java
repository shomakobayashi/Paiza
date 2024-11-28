

import java.util.Scanner;

public class Kisoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        
        while (true) {
            int reversed = reverseNumber(n);
            n = n + reversed;
            if (isPalindrome(n)) {
                System.out.println(n);
                break;
            }
        }
    }

    // 数字を反転するメソッド
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // 回文かどうかを確認するメソッド
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
}
