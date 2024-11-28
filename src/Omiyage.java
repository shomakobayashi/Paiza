import java.util.Scanner;
import java.util.Arrays;

public class Omiyage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力を受け取る
        int N = sc.nextInt();
        int X = sc.nextInt(), A = sc.nextInt();
        int Y = sc.nextInt(), B = sc.nextInt();
        int Z = sc.nextInt(), C = sc.nextInt();

        // DP配列: dp[i] = i個買うための最小コスト
        // 大きな値で初期化 (最大でも200個買うので、それ以上の値に設定)
        int[] dp = new int[N + Z + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // 0個のときのコストは0

        // 3種類のパックについてDPを更新
        for (int i = 0; i <= N + Z; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            // X個入りのパックを買う場合
            if (i + X <= N + Z) dp[i + X] = Math.min(dp[i + X], dp[i] + A);
            // Y個入りのパックを買う場合
            if (i + Y <= N + Z) dp[i + Y] = Math.min(dp[i + Y], dp[i] + B);
            // Z個入りのパックを買う場合
            if (i + Z <= N + Z) dp[i + Z] = Math.min(dp[i + Z], dp[i] + C);
        }

        // N個以上になる最小コストを探す
        int result = Integer.MAX_VALUE;
        for (int i = N; i <= N + Z; i++) {
            result = Math.min(result, dp[i]);
        }

        // 結果を出力
        System.out.println(result);
    }
}
