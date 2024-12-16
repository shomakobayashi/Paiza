import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // タスク数
        Task[] tasks = new Task[N];

        // タスク情報の読み込み
        for (int i = 0; i < N; i++) {
            int t = sc.nextInt(); // 必要日数
            int b = sc.nextInt(); // 開始日
            int e = sc.nextInt(); // 終了日
            tasks[i] = new Task(t, b, e);
        }

        // タスクの実行が可能か確認
        System.out.println(canCompleteTasks(tasks) ? "YES" : "NO");
    }

    public static boolean canCompleteTasks(Task[] tasks) {
        // 終了日 (endDay) が早い順にタスクをソート
        Arrays.sort(tasks, Comparator.comparingInt(task -> task.endDay));

        // カレンダー (日ごとのスケジュール管理用)
        boolean[] calendar = new boolean[10001]; // 最大日付分（1～10000）

        for (Task task : tasks) {
            int daysNeeded = task.duration; // 必要日数
            // タスクを開始日から終了日まで埋められるか確認
            for (int day = task.endDay; day >= task.startDay; day--) {
                if (!calendar[day]) { // その日が空いているならタスクを埋める
                    calendar[day] = true;
                    daysNeeded--;
                }
                if (daysNeeded == 0) break; // 必要日数を満たしたら終了
            }
            // 必要日数が残っている場合、タスクを完了できない
            if (daysNeeded > 0) return false;
        }

        return true; // 全タスクを完了できる場合
    }

    static class Task {
        int duration; // 必要日数
        int startDay; // 開始日
        int endDay;   // 終了日

        public Task(int duration, int startDay, int endDay) {
            this.duration = duration;
            this.startDay = startDay;
            this.endDay = endDay;
        }
    }
}
