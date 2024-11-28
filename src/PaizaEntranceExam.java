import java.util.Scanner;

public class PaizaEntranceExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 受験者の人数
        int passCount = 0;     // 通過人数のカウント

        for (int i = 0; i < N; i++) {
            String type = sc.next();  // 文系か理系か ('l' または 's')
            int english = sc.nextInt();
            int math = sc.nextInt();
            int science = sc.nextInt();
            int japanese = sc.nextInt();
            int geography = sc.nextInt();

            int totalScore = english + math + science + japanese + geography; // 全科目の合計

            // 全科目の合計が350点未満なら不合格
            if (totalScore < 350) {
                continue;
            }

            // 文理区分に応じたチェック
            if (type.equals("s")) {
                // 理系: 数学 + 理科 >= 160
                if (math + science >= 160) {
                    passCount++;
                }
            } else if (type.equals("l")) {
                // 文系: 国語 + 地理歴史 >= 160
                if (japanese + geography >= 160) {
                    passCount++;
                }
            }
        }

        // 通過人数を出力
        System.out.println(passCount);
        sc.close();
    }
}
