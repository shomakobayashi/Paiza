import java.util.Scanner;

public class Irekae {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    
    String irekae = str.replaceAll("[aiueoAIUEO]", "");

    System.out.println(irekae);
    
  }

}
