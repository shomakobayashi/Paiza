import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Iinkai {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> voteCount = new HashMap<>();
       
        for (int i = 0; i < a; i++) {
            String name = sc.nextLine();
            voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
        }

        String representative = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                representative = entry.getKey();
            }
        }
        
        // 結果の出力
        System.out.println(representative);
    }
}
