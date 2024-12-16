import java.util.Scanner;

public class Bean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 参加者の人数 N を入力
        int N = sc.nextInt();
        
        // 2. 各参加者の年齢を入力
        int[] ages = new int[N];
        for (int i = 0; i < N; i++) {
            ages[i] = sc.nextInt();
        }
        
        // 3. 豆の数を記録する配列を作成
        int[] beans = new int[N];
        
        // 4. 命令の数 M を入力
        int M = sc.nextInt();
        
        // 5. 各命令に従って豆を配布
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;  // 0-indexed にするために -1
            int B = sc.nextInt() - 1;  // 0-indexed にするために -1
            int C = sc.nextInt();
            
            for (int j = A; j <= B; j++) {
                // 参加者の年齢を超えないように豆を追加
                beans[j] = Math.min(beans[j] + C, ages[j]);
            }
        }
        
        // 6. 最終的な豆の数を出力
        for (int i = 0; i < N; i++) {
            System.out.println(beans[i]);
        }
    }
}
