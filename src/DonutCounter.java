import java.util.Scanner;

public class DonutCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力データを取得
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine(); // 改行を読み飛ばす

        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        int donutCount = 0;

        // 「ドーナツの絵」の探索
        for (int i = 1; i < H - 1; i++) {
            for (int j = 1; j < W - 1; j++) {
                if (isDonut(grid, i, j)) {
                    donutCount++;
                }
            }
        }

        // 結果を出力
        System.out.println(donutCount);
    }

    // 「ドーナツの絵」の判定メソッド
    private static boolean isDonut(char[][] grid, int i, int j) {
        return grid[i][j] == '.' && // 中心が白
               grid[i - 1][j - 1] == '#' && grid[i - 1][j] == '#' && grid[i - 1][j + 1] == '#' && // 上の行が黒
               grid[i][j - 1] == '#' && grid[i][j + 1] == '#' && // 中央左右が黒
               grid[i + 1][j - 1] == '#' && grid[i + 1][j] == '#' && grid[i + 1][j + 1] == '#'; // 下の行が黒
    }
}
