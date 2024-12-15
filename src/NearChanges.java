import java.util.HashMap;
import java.util.Scanner;

public class NearChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ガーベラの色の種類数 N
        int N = sc.nextInt();
        int[] current = new int[2 * N];

        // 現在のガーベラの配置
        for (int i = 0; i < 2 * N; i++) {
            current[i] = sc.nextInt();
        }

        // 理想の配置を作成する
        int[] ideal = new int[2 * N];
        for (int i = 0; i < N; i++) {
            ideal[i] = i + 1;       // 1, 2, ..., N
            ideal[i + N] = i + 1;   // 1, 2, ..., N (2回目)
        }

        // スワップ数をカウント
        int minSwaps = countMinSwaps(current, ideal);
        System.out.println(minSwaps);
    }

    // 最小の交換回数を求める関数
    private static int countMinSwaps(int[] current, int[] ideal) {
        int swapCount = 0;
        int n = current.length;

        // 現在の配列のインデックスを理想的な配列のインデックスにマッピング
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(current[i], i);
        }

        // 各要素についてサイクルを探し、スワップ回数を計算する
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] || current[i] == ideal[i]) {
                continue; // すでに訪れたか、正しい位置にある場合はスキップ
            }

            // サイクルのサイズを計算
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(ideal[j]); // 理想の位置に移動
                cycleSize++;
            }

            // サイクルサイズが k の場合、k - 1 のスワップが必要
            if (cycleSize > 0) {
                swapCount += (cycleSize - 1);
            }
        }

        return swapCount;
    }
}
