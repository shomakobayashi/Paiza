import java.util.Scanner;

public class Guusuu {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int score = (a * b) % 2;
    

    System.out.println(score);
    
    
  }
}