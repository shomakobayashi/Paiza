import java.util.Scanner;

public class Kisu {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int score = (a * b) % 2;
    
    if (score != 0) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }
  }
}
