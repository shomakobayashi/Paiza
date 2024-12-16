import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 入力: 学生の人数 N と合格点 M
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> passList = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            // 各学生のテスト点数と欠席回数を入力
            int testScore = scanner.nextInt();
            int absences = scanner.nextInt();
            
            // 成績を計算
            int score = Math.max(testScore - 5 * absences, 0);
            
            // 成績が合格点以上なら学籍番号を出力
            if (score >= M) {
               passList.add(i);
            }
        }
        for (int i : passList) {
            System.out.println(i);
        }
    }
}
