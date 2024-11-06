
import java.util.Scanner;

public class SubscriptionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1行目の入力（NとM）
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 商品ごとの購入頻度と価格のリスト
        int[] frequencies = new int[N];
        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            frequencies[i] = scanner.nextInt();
            prices[i] = scanner.nextInt();
        }

        // 週ごとの合計金額を計算する
        int totalCost = 0;
        for (int week = 1; week <= M; week++) {
            int weeklyCost = 0;
            int itemCount = 0;

            // 各商品の頻度に基づいて今週に届くかどうかを判定
            for (int i = 0; i < N; i++) {
                if (week % frequencies[i] == 0) {
                    weeklyCost += prices[i];
                    itemCount++;
                }
            }

            // 割引計算
            if (itemCount >= 3) {
                weeklyCost *= 0.85; // 15%引き
            } else if (itemCount == 2) {
                weeklyCost *= 0.90; // 10%引き
            }

            // 1週分の金額を合計金額に追加
            totalCost += (int) Math.round(weeklyCost);
        }

        // 合計金額を出力
        System.out.println(totalCost);
    }
}