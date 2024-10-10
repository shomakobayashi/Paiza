import java.util.Scanner;

public class Leet  {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();

       StringBuilder leet = new StringBuilder();
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'A':
                    leet.append('4');
                    break;
                case 'E':
                    leet.append('3');
                    break;
                case 'G':
                    leet.append('6');
                    break;
                case 'I':
                    leet.append('1');
                    break;
                case 'O':
                    leet.append('0');
                    break;
                case 'S':
                    leet.append('5');
                    break;
                case 'Z':
                    leet.append('2');
                    break;
                default:
                    leet.append(c);
                    break;
            }
        }

        // 変換後の文字列を出力
        System.out.println(leet.toString());
    }
}
