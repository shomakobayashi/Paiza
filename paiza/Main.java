import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを取得する
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        
        // パイザ記法の式を解析して計算する
        int result = parseAndCalculate(input);
        
        // 結果を出力する
        System.out.println(result);
    }

    private static int parseAndCalculate(String input) {
        String[] tokens = input.split("\\+");
        int sum = 0;

        for (String token : tokens) {
            sum += parseNumber(token);
        }

        return sum;
    }

    private static int parseNumber(String token) {
        int tens = 0;
        int ones = 0;

        int i = 0;
        while (i < token.length() && token.charAt(i) == '<') {
            tens++;
            i++;
        }
        while (i < token.length() && token.charAt(i) == '/') {
            ones++;
            i++;
        }

        return tens * 10 + ones;
    }
}
