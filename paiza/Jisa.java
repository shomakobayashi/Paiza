import java.util.Scanner;

public class Jisa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;

        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (d < b) {
                d += 24;
            }

            int dayTime = (24 - b) + c + d;
            
            if (dayTime < minTime) {
                minTime = dayTime;
            }
            if (dayTime > maxTime) {
                maxTime = dayTime;
            }
        }
        sc.close();
        
        System.out.println(minTime);
        System.out.println(maxTime);

    }

}
