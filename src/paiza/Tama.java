package paiza;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Tama {

  public static void main(String[] args) {
    // 入力を受け取るためのスキャナを作成
    Scanner scanner = new Scanner(System.in);
    
    // 最初の行で箱の数nとボールの半径rを取得
    int n = scanner.nextInt();
    int r = scanner.nextInt();
    
    // ボールの直径を計算
    int ballDiameter = 2 * r;
    
    // 結果を格納するリスト
    List<Integer> result = new ArrayList<>();
    
    // n個の箱の情報を処理
    for (int i = 1; i <= n; i++) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        
        // 箱の高さ、幅、奥行きの最小値を取得
        int minDimension = Math.min(h, Math.min(w, d));
        
        // ボールが収納できる場合、結果に追加
        if (ballDiameter <= minDimension) {
            result.add(i);
        }
    }
    
    // 結果を改行区切りで出力
    for (int boxNumber : result) {
        System.out.println(boxNumber);
    }
  }
}
