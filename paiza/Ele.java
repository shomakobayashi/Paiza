import java.util.Scanner;

public class Ele {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int currentFloor = 1;
        int totalDistance = 0;

        for (int i =  0; i < a; i++) {
            int nextFloor = sc.nextInt();
             // 現在の階から次の階までの移動距離を計算
             totalDistance += Math.abs(nextFloor - currentFloor);
             // 現在の階を更新
             currentFloor = nextFloor;
        }
        // 合計の移動距離を出力
        System.out.println(totalDistance);
        
    }

}
