import java.util.Scanner;

public class Point {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    int pointTotal = 0;
    int num = sc.nextInt();
    
    for (int  i = 0;  i < num; i++) {
      int days = sc.nextInt();
      int price = sc.nextInt();
      int points;

      if (days == 3 || days == 13 || days == 23 || days == 30) {
        points = (price * 3) / 100;
      } else if (days == 5 || days == 15 || days == 25) {
        points = (price * 5) / 100;
      } else {
        points = (price * 1) / 100;
      }
      pointTotal += points;
    }
    System.out.println(pointTotal);

  }
}
