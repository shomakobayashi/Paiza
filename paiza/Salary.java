import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力の読み取り
        int X = sc.nextInt(); // 通常時給
        int Y = sc.nextInt(); // 夜間時給
        int Z = sc.nextInt(); // 深夜時給
        int N = sc.nextInt(); // 出勤日数

        int totalSalary = 0;

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            // 時給を計算
            for (int hour = start; hour < end; hour++) {
                if (hour >= 9 && hour < 17) {
                    totalSalary += X; // 通常時給
                } else if (hour >= 17 && hour < 22) {
                    totalSalary += Y; // 夜間時給
                } else {
                    totalSalary += Z; // 深夜時給
                }
            }
        }

        // 結果の出力
        System.out.println(totalSalary);

        sc.close();
    }
}
