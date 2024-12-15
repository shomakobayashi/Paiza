import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Koma {
    static int[] dRow = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dCol = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // チェスボードのサイズ
        int H = sc.nextInt() - 1; // クイーンもどきの初期行（0-indexed）
        int W = sc.nextInt() - 1; // クイーンもどきの初期列（0-indexed）
        int K = sc.nextInt(); // 最大移動回数

        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{H, W, 0}); // 現在の位置 (行, 列, 移動回数)
        visited[H][W] = true;

        int reachableCount = 1; // 開始位置も含める

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int moves = current[2];

            if (moves == K) continue;

            // 縦・横方向への1マス移動
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                if (isValid(newRow, newCol, N) && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol, moves + 1});
                    reachableCount++;
                }
            }

            // 斜め方向への任意の距離移動
            for (int i = 4; i < 8; i++) {
                int newRow = row;
                int newCol = col;
                while (true) {
                    newRow += dRow[i];
                    newCol += dCol[i];
                    if (!isValid(newRow, newCol, N) || visited[newRow][newCol]) break;
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol, moves + 1});
                    reachableCount++;
                }
            }
        }

        System.out.println(reachableCount);
    }

    static boolean isValid(int row, int col, int N) {
        return row >= 0 && row < N && col >= 0 && col < N;
    }
}
