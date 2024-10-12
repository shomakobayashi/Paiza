import java.util.Scanner;

public class Kabu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力の取得
        int N = scanner.nextInt();  // 日数
        int c1 = scanner.nextInt(); // 買い条件の価格
        int c2 = scanner.nextInt(); // 売り条件の価格

        int totalStocks = 0;   // 保有している株の数
        int totalSpent = 0;    // 株の購入に使った総額
        int totalProfit = 0;   // 売却で得た総利益

        // N-1 日目までの処理
        for (int i = 0; i < N  ; i++) {
            int price = scanner.nextInt();  // i日目の株価

            if (price <= c1) {
                // 株価が c1 以下の場合、1株購入
                totalStocks++;
                totalSpent += price;
            } else if (price >= c2 ) {
                // 株価が c2 以上の場合、全ての株を売却
                totalProfit += totalStocks * price;
                totalStocks = 0;  // 売却後、保有株はゼロに
            }
        }

        // N 日目の株価を取得し、全ての株を売却
        int total = (totalProfit - totalSpent);
        System.out.println(total);
        }
    }
