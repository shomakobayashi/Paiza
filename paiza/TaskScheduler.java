import java.util.Arrays;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // タスクの数
        int[] t = new int[N]; // 必要日数
        int[] b = new int[N]; // 開始日
        int[] e = new int[N]; // 終了日

        // タスク情報の入力
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt(); // 必要日数
            b[i] = sc.nextInt(); // 開始日
            e[i] = sc.nextInt(); // 終了日
        }

        // タスクのスケジュール処理
        System.out.println(canCompleteTasks(t, b, e) ? "YES" : "NO");
    }

    public static boolean canCompleteTasks(int[] t, int[] b, int[] e) {
        int N = t.length;

        // 優先度順にタスクを処理するために終了日でソート
        Integer[] taskIndices = new Integer[N];
        for (int i = 0; i < N; i++) {
            taskIndices[i] = i;
        }
        Arrays.sort(taskIndices, (i1, i2) -> e[i1] - e[i2]);

        // 各日にタスクを割り当てるためのカレンダー（終了日までの各日の状態を管理）
        boolean[] calendar = new boolean[1001]; // 1から1000までの日付をカバー

        // タスク処理
        for (int i : taskIndices) {
            int daysNeeded = t[i]; // タスクに必要な日数
            boolean taskCompleted = false;

            // タスクを終了日から遡って必要日数分の空いている日を探して実行
            for (int day = e[i]; day >= b[i]; day--) {
                if (!calendar[day]) { // 空いている日を見つけた場合
                    calendar[day] = true; // その日を使う
                    daysNeeded--; // 必要日数を減らす
                }
                if (daysNeeded == 0) { // 必要日数を埋めたら終了
                    taskCompleted = true;
                    break;
                }
            }
            
            // 必要日数が埋まらなかった場合、タスクが終了日までに完了しない
            if (!taskCompleted) {
                return false;
            }
        }

        return true; // 全てのタスクが終了日までに完了できる場合
    }
}
