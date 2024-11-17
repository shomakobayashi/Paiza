

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tohyo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 株主の数を読み取る
        int n = Integer.parseInt(scanner.nextLine());
        
        // 方法1と方法2の投票数を保持するマップ
        Map<String, Integer> method1Votes = new HashMap<>();
        Map<String, Integer> method2Votes = new HashMap<>();
        
        // 投票データを処理
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String candidate = input[0];
            int shares = Integer.parseInt(input[1]);
            
            // 方法1：1票の加算
            method1Votes.put(candidate, method1Votes.getOrDefault(candidate, 0) + 1);
            
            // 方法2：持株数分の加算
            method2Votes.put(candidate, method2Votes.getOrDefault(candidate, 0) + shares);
        }
        
        // 方法1で最多票を得た候補者を取得
        String method1Winner = getMaxVotedCandidate(method1Votes);
        
        // 方法2で最多票を得た候補者を取得
        String method2Winner = getMaxVotedCandidate(method2Votes);
        
        // 結果を出力
        System.out.println(method1Winner);
        System.out.println(method2Winner);
    }

    // 最多票を得た候補者を取得するヘルパーメソッド
    private static String getMaxVotedCandidate(Map<String, Integer> votes) {
        String winner = null;
        int maxVotes = 0;
        
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue();
            }
        }
        
        return winner;
    }
}

