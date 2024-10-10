import java.util.Scanner;


public class Leet_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder leet = new StringBuilder();

        for(char c : s.toCharArray()){
            switch(c) {
                case 'A':
                    leet.append('4');
                    break;
                case 'B':
                    leet.append('4');
                    break;
                case 'C':
                    leet.append('4');
                    break;
                case 'D':
                    leet.append('4');
                    break;
                case 'E':
                    leet.append('4');
                    break;
                default:
                    leet.append(c);
                    break;
            }
        }
        System.out.println(leet.toString());
    }
}
