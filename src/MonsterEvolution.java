import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MonsterEvolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 現在のモンスターのパラメータを取得
        int atk = scanner.nextInt();
        int def = scanner.nextInt();
        int agi = scanner.nextInt();

        // 進化先モンスターの数を取得
        int n = scanner.nextInt();
        scanner.nextLine(); // 改行を消費

        // 条件を満たすモンスターを格納するリスト
        List<String> evolutions = new ArrayList<>();

        // 各進化先モンスターの条件をチェック
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[01];
            int minAtk = Integer.parseInt(parts[1]);
            int maxAtk = Integer.parseInt(parts[2]);
            int minDef = Integer.parseInt(parts[3]);
            int maxDef = Integer.parseInt(parts[4]);
            int minAgi = Integer.parseInt(parts[5]);
            int maxAgi = Integer.parseInt(parts[6]);

            // 条件を満たすかチェック
            if (atk >= minAtk && atk <= maxAtk &&
                def >= minDef && def <= maxDef &&
                agi >= minAgi && agi <= maxAgi) {
                evolutions.add(name);
            }
        }

        // 結果を出力
        if (evolutions.isEmpty()) {
            System.out.println("no evolution");
        } else {
            for (String evolution : evolutions) {
                System.out.println(evolution);
            }
        }

        scanner.close();
    }
}
