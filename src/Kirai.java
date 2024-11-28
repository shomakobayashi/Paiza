import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kirai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 嫌いな数字を読み込む
        String dislikedNumber = scanner.nextLine();
        
        // 病室の総数を読み込む
        int roomCount = Integer.parseInt(scanner.nextLine());
        
        // 希望する病室のリストを作成
        List<String> preferredRooms = new ArrayList<>();
        
        for (int i = 0; i < roomCount; i++) {
            String roomNumber = scanner.nextLine();
            
            // 嫌いな数字が部屋番号に含まれていない場合、リストに追加
            if (!roomNumber.contains(dislikedNumber)) {
                preferredRooms.add(roomNumber);
            }
        }
        
        // 希望する部屋がない場合は "none" を出力
        if (preferredRooms.isEmpty()) {
            System.out.println("none");
        } else {
            // 希望する部屋を順番に出力
            for (String room : preferredRooms) {
                System.out.println(room);
            }
        }
        
        scanner.close();
    }
}
