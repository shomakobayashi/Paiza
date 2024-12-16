import java.util.Scanner;

public class Shiritori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1行目に入力される単語の数 N を読み取る
        int N = scanner.nextInt();
        scanner.nextLine();  // 改行を読み取る
        
        // 単語の配列を作成
        String[] words = new String[N];
        
        // N個の単語を読み取る
        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine();
        }        
        
        // しりとりが成立しているかどうかをチェックする
        for(int i = 0; i < N - 1; i++) {
            String currentWord = words[i];
            String nextWord    = words[i + 1];
            
            // 現在の単語の末尾の文字と次の単語の先頭の文字を比較
            char lastChar = currentWord.charAt(currentWord.length() -1);
            char firstChar = nextWord.charAt(0);
            
            if (lastChar != firstChar) {
                System.out.println(lastChar + " " + firstChar);
                return;
            }
        }
        
        // すべての単語がしりとりを満たしている場合
        System.out.println("Yes");
    }
}
