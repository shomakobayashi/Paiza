import java.util.*;
import java.util.Scanner;

public class Haloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力の取得
        int N = sc.nextInt(); // 家の数
        int M = sc.nextInt(); // 男の子の数
        int K = sc.nextInt(); // 連続で驚かされると帰る数

        Set<Integer> boyHouses = new HashSet<>(); // 男の子が隠れている家を格納
        for (int i = 0; i < M; i++) {
            boyHouses.add(sc.nextInt());
        }

        int candyCount = 0;   // もらえるお菓子の数
        int scareStreak = 0;  // 連続して驚かされる回数

        for (int house = 1; house <= N; house++) {
            if (boyHouses.contains(house)) {
                scareStreak++; // 驚かされた
                if (scareStreak >= K) {
                    break; // Alice は泣いて帰る
                }
            } else {
                candyCount++;  // お菓子をもらう
                scareStreak = 0; // 驚かされなかったのでリセット
            }
        }

        // 結果を出力
        System.out.println(candyCount);
    }
}
