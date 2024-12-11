import java.util.Scanner;
import java.util.*;

public class Kinsetsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 地点 A の座標を取得
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // k の取得
        int k = scanner.nextInt();

        // N の取得
        int N = scanner.nextInt();

        // 地価が既知の地点の情報を格納するリスト
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();
            int pi = scanner.nextInt();
            // 地点情報をリストに追加
            points.add(new Point(xi, yi, pi));
        }

        // 距離の計算とソート
        points.sort((p1, p2) -> Double.compare(p1.distance(x, y), p2.distance(x, y)));

        // k個の点の地価の平均を計算
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += points.get(i).price;
        }

        // 平均値を四捨五入
        int result = Math.round((float) sum / k);

        // 結果を出力
        System.out.println(result);
    }

    // 地点情報を表すクラス
    static class Point {
        int x, y, price;

        Point(int x, int y, int price) {
            this.x = x;
            this.y = y;
            this.price = price;
        }

        // 距離を計算するメソッド
        double distance(int x2, int y2) {
            return Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
        }
    }
}
