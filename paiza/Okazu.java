import java.util.Scanner;

public class Okazu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力を読み込む
        int count = sc.nextInt(); // おかずの種類数
        int budGet = sc.nextInt(); // 予算
        int[] price = new int[count]; // 価格
        int[] satisFaction = new int[count]; // 満足度

        for (int i = 0; i < count; i++) {
            price[i] = sc.nextInt(); // 各おかずの価格を入力
        }

        for (int i = 0; i < count; i++) {
            satisFaction[i] = sc.nextInt(); // 各おかずの満足度を入力
        }

        int maxSatisfaction = Integer.MIN_VALUE; // 最大満足度（初期値は非常に小さな値）

        // 全ての組み合わせをビット全探索で確認する
        for (int i = 1; i < (1 << count); i++) {
            int selectedCount = Integer.bitCount(i); // 選ばれたおかずの数
            if (selectedCount < 1 || selectedCount > 3) {
                continue; // 1つ以上3つ以下選ばないといけないので、それ以外の組み合わせは無視
            }

            int totalPrice = 0; // 合計金額
            int totalSatisfaction = 0; // 合計満足度

            for (int j = 0; j < count; j++) {
                if ((i & (1 << j)) != 0) { // j番目のおかずが選ばれているかどうか
                    totalPrice += price[j];
                    totalSatisfaction += satisFaction[j];
                }
            }

            // 合計金額が予算と一致する場合
            if (totalPrice == budGet) {
                maxSatisfaction = Math.max(maxSatisfaction, totalSatisfaction);
            }
        }

        // 結果を出力する
        if (maxSatisfaction == Integer.MIN_VALUE) {
            // もしどの組み合わせも条件に合わなかったら0を返す（あり得ないかもしれないが保険として）
            System.out.println(0);
        } else {
            System.out.println(maxSatisfaction);
        }
    }
}