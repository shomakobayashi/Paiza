import java.util.Scanner;

public class Kaito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();  // メッセージを読み込む
        StringBuilder result = new StringBuilder();  // 結果を格納するためのStringBuilder
        
        int i = 0;
        while (i < S.length()) {
            char ch = S.charAt(i);
            
            // 英字の場合
            if (Character.isLetter(ch)) {
                if (ch == 'Z') {
                    result.append('A');  // ZならAに変換
                } else {
                    result.append((char)(ch + 1));  // それ以外なら次の文字に
                }
                i++;  // 1文字進む
            }
            // 数字の場合
            else if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                
                // 数字が連続する場合に対応するため、連続した数字をすべて取得
                while (i < S.length() && Character.isDigit(S.charAt(i))) {
                    num.append(S.charAt(i));
                    i++;
                }
                
                // 数字に変換して1加算
                int number = Integer.parseInt(num.toString()) + 1;
                result.append(number);  // 加算した結果を文字列に追加
            }
        }
        
        // 結果を出力
        System.out.println(result.toString());
    }
}
