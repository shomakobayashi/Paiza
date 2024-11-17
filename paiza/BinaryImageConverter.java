import java.util.Scanner;

public class BinaryImageConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 画像の縦横サイズを読み込む
        int H = sc.nextInt(); // 高さ
        int W = sc.nextInt(); // 幅

        // 画像の各画素を読み込み、二値化して出力する
        int[][] binaryImage = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int pixel = sc.nextInt(); // 画素値を読み込み
                // 二値化条件に基づき1または0を設定
                binaryImage[i][j] = (pixel >= 128) ? 1 : 0;
            }
        }
        
        // 二値化結果を出力
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(binaryImage[i][j]);
                if (j < W - 1) System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
