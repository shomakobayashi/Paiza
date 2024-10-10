import java.util.Scanner;

public class Tesuryo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int hikidashi = Integer.parseInt(line);
    int tesuryo   = 120;
    int total     = hikidashi - tesuryo;
    System.out.println(total);
  }
}
