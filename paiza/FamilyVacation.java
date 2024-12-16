import java.util.Scanner;

public class FamilyVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // メンバー数の取得
        int N = Integer.parseInt(scanner.nextLine().trim());

        // 最初のメンバーの休み期間を初期値に設定
        String[] firstMember = scanner.nextLine().trim().split(" ");
        int start = Integer.parseInt(firstMember[0]);
        int end = Integer.parseInt(firstMember[1]);

        // 他のメンバーの休みの範囲と共通部分を計算
        for (int i = 1; i < N; i++) {
            String line = scanner.nextLine().trim();  // 空行対策
            if (line.isEmpty()) {
                System.out.println("NG");
                return;
            }
            String[] period = line.split(" ");
            int memberStart = Integer.parseInt(period[0]);
            int memberEnd = Integer.parseInt(period[1]);

            // 共通部分を更新
            start = Math.max(start, memberStart);
            end = Math.min(end, memberEnd);

            // 共通部分が存在しない場合は "NG" を即座に出力して終了
            if (start > end) {
                System.out.println("NG");
                return;
            }
        }

        // ループを抜けても共通する日がある場合は "OK" を出力
        System.out.println("OK");
    }
}
