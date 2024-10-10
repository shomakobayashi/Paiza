import java.util.Scanner;

public class Omoji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 校正ルール表 S
        String S = sc.nextLine();
        // 校正前の文字列 T
        String T = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        // 校正ルールに基づいて文字列 T を変換
        for (char c : T.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 大文字の場合： 'A' からのオフセットを計算し、S の該当する大文字を取得
                result.append(S.charAt(c - 'A'));
            } else if (Character.isLowerCase(c)) {
                // 小文字の場合： 'a' からのオフセットを計算し、S の該当する小文字を取得
                result.append(S.charAt(c - 'a'));
            }
        }
        
        // 結果を出力
        System.out.println(result.toString());
    }



}