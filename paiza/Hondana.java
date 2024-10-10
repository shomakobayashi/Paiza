import java.util.Scanner;

public class Hondana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 手持ちの本の数
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        // 本棚の数
        int N = sc.nextInt();
        
        int minPrice = Integer.MAX_VALUE;
        
        // 各本棚について
        for (int i = 0; i < N; i++) {
            int P = sc.nextInt(); // 本棚の値段
            int X = sc.nextInt(); // A5サイズの収納可能数
            int Y = sc.nextInt(); // コミックサイズの収納可能数
            int Z = sc.nextInt(); // 文庫サイズの収納可能数
            
            // 各サイズの本を優先して入れる
            if (X >= A && (X - A + Y) >= B && (X - A + Y - B + Z) >= C) {
                minPrice = Math.min(minPrice, P); // 最小値更新
            }
        }
        
        // 結果出力
        if (minPrice == Integer.MAX_VALUE) {
            System.out.println(-1); // 全て収まる本棚がない場合
        } else {
            System.out.println(minPrice); // 最も安い本棚の値段
        }
    }
}
