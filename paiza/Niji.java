import java.util.Scanner;

public class Niji {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 天気予報が与えられる日数を取得
        int D = scanner.nextInt();

        // 天気予報を配列に格納
        int[] weather = new int[D];
        for (int i = 0; i < D; i++) {
            weather[i] = scanner.nextInt();
        }

        // 虹が見られる可能性がある日を格納する変数
        boolean found = false;
        StringBuilder result = new StringBuilder();

        // 2日目からD日目までチェック
        for (int i = 1; i < D; i++) {
            if (weather[i - 1] == 2 && weather[i] == 0) { // 前日が雨で当日が晴れ
                if (found) {
                    result.append(" ");
                }
                result.append(i);
                found = true;
            }
        }

        // 虹が見られる可能性がある日がなければ -1 を出力
        if (!found) {
            System.out.println("-1");
        } else {
            System.out.println(result.toString());
        }
    }
}
