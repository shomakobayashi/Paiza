import java.util.Arrays;
import java.util.Scanner;

public class Kohei {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] scores = new int[num];

        for (int i = 0; i < num; i++) {
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);

        double sum = 0;
        for (int i = 1; i < num - 1; i++) {
            sum += scores[i];
        }

        double average = sum / (num - 2);
        average = Math.floor(average * 10) / 10;
        System.out.println(average);



    }

}
