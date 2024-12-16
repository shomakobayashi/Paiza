import java.util.Scanner;

public class Card {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int oya1 = sc.nextInt();
    int oya2 = sc.nextInt();
    int num  = sc.nextInt();

    for (int i = 0; i < num; i++) {
      int kids1 = sc.nextInt();
      int kids2 = sc.nextInt();

      if (kids1 >oya1 || kids2 == oya2 && kids2 < oya2) {
        System.out.println("Low");
      } else {
        System.out.println("High");
      }
    }



  }

}
