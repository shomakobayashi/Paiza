import java.util.*;
import java.util.Scanner;


public class CardCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 行目の入力: N (カードの総数) と M (カードの種類数)
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 種類の確認用セット
        Set<Integer> collectedCards = new HashSet<>();

        // カードを順番に確認
        for (int i = 1; i <= N; i++) { // 1-based index
            int card = scanner.nextInt();
            collectedCards.add(card); // 新しいカードを追加

            // M種類揃ったら出力して終了
            if (collectedCards.size() == M) {
                System.out.println(i);
                return;
            }
        }

        // 全て開けても揃わない場合
        System.out.println("unlucky");
    }
}
