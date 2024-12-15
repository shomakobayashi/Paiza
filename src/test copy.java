import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt(); // 高さ
    int W = sc.nextInt(); // 幅
    // 画像の縦横サイズを読み込む
    int[][] binaryImage = new int[H][W];

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int pixel = sc.nextInt();
        binaryImage[i][j] = (pixel >= 128) ? 1 : 0;
      }
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.println(binaryImage[i][j]);
    


   }
 
}
