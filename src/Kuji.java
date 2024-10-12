import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Kuji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 当選番号を取得
        Set<Integer> winningNumbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            winningNumbers.add(sc.nextInt());
        }

        // 購入したくじの枚数
        int num = sc.nextInt();

        // 一致した数字の数を保存するリスト
        List<Integer> matchCounts = new ArrayList<>();

        // 各くじの数字を処理
        for (int i = 0; i < num; i++) {
            int matchCount = 0;
            for (int j = 0; j < 6; j++) {
                int ticketNumber = sc.nextInt();
                // 当選番号と一致する場合、カウントを増やす
                if (winningNumbers.contains(ticketNumber)) {
                    matchCount++;
                }
            }
            // 一致した数字の数をリストに追加
            matchCounts.add(matchCount);
        }

        // 結果を出力
        for (int count : matchCounts) {
            System.out.println(count);
        }

        sc.close();
    }
}
