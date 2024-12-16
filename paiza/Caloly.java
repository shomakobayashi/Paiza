import java.util.Scanner;

public class Caloly {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int rice = 540;
    int sevings = Integer.parseInt(line);
    int total = rice * sevings;

    System.out.println(total);
}

}
