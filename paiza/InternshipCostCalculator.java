import java.util.Scanner;

public class InternshipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 新幹線の片道料金、ホテルの宿泊費、インターンシップの回数を入力
        int shinkansenCost = scanner.nextInt();  // 新幹線の片道料金
        int hotelCost = scanner.nextInt();       // ホテルの1泊あたりの料金
        int numOfInternships = scanner.nextInt(); // インターンシップの回数

        // インターンシップの開始日と終了日を格納
        int[] startDates = new int[numOfInternships];
        int[] endDates = new int[numOfInternships];

        for (int i = 0; i < numOfInternships; i++) {
            startDates[i] = scanner.nextInt();  // i番目のインターンシップの開始日
            endDates[i] = scanner.nextInt();    // i番目のインターンシップの終了日
        }

        // 最小の自己負担額を計算
        int totalCost = 0;

        // 最初のインターンシップに行くための新幹線料金
        totalCost += shinkansenCost;

        // 各インターンシップ間のコストを計算
        for (int i = 0; i < numOfInternships - 1; i++) {
            // インターンシップ間の宿泊日数を計算
            int gapDays = (startDates[i+1]) -  endDates[i];

            // ホテルに泊まり続ける場合のコスト
            int stayCost = gapDays * hotelCost;
            // 一度帰宅して再度戻る場合の往復コスト
            int travelCost = 2 * shinkansenCost;

            // どちらが安いかを比較し、安い方を合計に加算
            totalCost += Math.min(stayCost, travelCost);
        }

        // 最後のインターンシップ終了後に帰宅するための新幹線料金
        totalCost += shinkansenCost;

        // 最小の自己負担額を出力
        System.out.println(totalCost);

        scanner.close();
    }
}
