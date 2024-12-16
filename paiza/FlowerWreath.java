import java.util.Scanner;

public class FlowerWreath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 入力の取得
        int N = scanner.nextInt();
        String S1 = scanner.next();
        String S2 = scanner.next();
        
        // リースの同じ種類かを判定
        if (areWreathsSame(S1, S2, N)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }

    // リースが同じ種類であるかどうかを判定するメソッド
    private static boolean areWreathsSame(String S1, String S2, int N) {
        // 2つのリースが同じ長さであることを確認
        if (S1.length() != N || S2.length() != N) {
            return false;
        }

        // S2を2回連結してS1の中に含まれるかを確認
        String doubledS2 = S2 + S2;
        return doubledS2.contains(S1);
    }
}