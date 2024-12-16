import java.util.Scanner;

public class Aikotoba {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  // 日数 n を取得
        int start = sc.nextInt();  // 1日目の始値
        int end = 0, maxHigh = Integer.MIN_VALUE, minLow = Integer.MAX_VALUE;

        // 最初の1日目のデータは既に取得済みなので残りを処理
        for (int i = 1; i <= n; i++) {
            int s = (i == 1) ? start : sc.nextInt();  // 1日目の始値は再入力しない
            int e = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            if (i == n) end = e;  // 最終日の終値を保持
            maxHigh = Math.max(maxHigh, h);  // 最大の高値を更新
            minLow = Math.min(minLow, l);    // 最小の安値を更新
        }
        sc.close();

        // 結果を出力
        System.out.println(start + " " + end + " " + maxHigh + " " + minLow);
    }
  }
