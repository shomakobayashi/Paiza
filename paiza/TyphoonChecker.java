package paiza;

import java.util.Scanner;

public class TyphoonChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 台風の中心と半径情報の入力
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        
        // 人の数 n の入力
        int n = sc.nextInt();
        
        // 半径の二乗を予め計算しておく
        int r1Squared = r1 * r1;
        int r2Squared = r2 * r2;
        
        // n 人の座標に対して暴風域にいるかどうかを判定
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // 距離の二乗を計算
            int distanceSquared = (x - xc) * (x - xc) + (y - yc) * (y - yc);
            
            // 判定して出力
            if (r1Squared <= distanceSquared && distanceSquared <= r2Squared) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}
