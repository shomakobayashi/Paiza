import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RobotSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力の読み込み
        int N = scanner.nextInt();  // ロボットが動作する秒数
        int M = scanner.nextInt();  // 動作のルールの数

        // 動作のルールを格納するリスト
        List<Rule> rules = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();  // 動作の間隔
            String b = scanner.next();  // 動作の名前
            rules.add(new Rule(a, b));
        }

        // 各秒ごとの出力を作成
        for (int i = 1; i <= N; i++) {
            StringBuilder sb = new StringBuilder();

            for (Rule rule : rules) {
                if (i % rule.interval == 0) {
                    if (sb.length() > 0) sb.append(" ");  // 空白で区切る
                    sb.append(rule.action);
                }
            }

            // 動作がなければ秒数を出力し、あればその動作を出力
            if (sb.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(sb);
            }
        }
        scanner.close();
    }

    // 動作のルールを表すクラス
    static class Rule {
        int interval;  // 動作の間隔
        String action; // 動作名

        Rule(int interval, String action) {
            this.interval = interval;
            this.action = action;
        }
    }
}
