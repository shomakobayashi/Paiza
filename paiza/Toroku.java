import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Toroku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ユーザー ID の個数を取得
        int num = sc.nextInt();
        sc.nextLine();  // nextInt()の後に空行を読み取るための処理
        String[] userIds = new String[num];

        // IDの取得
        for (int i = 0; i < num; i++) {
            userIds[i] = sc.nextLine();  // i を使ってユーザー ID を取得
        }

        List<User> users = new ArrayList<>();

        // ユーザー ID を分割してリストに追加
        for (String userId : userIds) {
            // 通し番号を取り出す
            String numberStr = userId.replaceAll("[^0-9]", ""); // 数字以外を取り除く
            if (!numberStr.isEmpty()) {  // 空でない場合のみ処理
                int number = Integer.parseInt(numberStr);
                users.add(new User(userId, number));
            }
        }

        // 通し番号でソート
        users.sort(Comparator.comparingInt(user -> user.number));

        // ソートされたユーザー ID を出力
        for (User user : users) {
            System.out.println(user.userId);
        }

        sc.close();  // Scanner を閉じる
    }

    // ユーザー情報を保持するクラス
    static class User {
        String userId;
        int number;

        User(String userId, int number) {
            this.userId = userId;
            this.number = number;
        }
    }
}
