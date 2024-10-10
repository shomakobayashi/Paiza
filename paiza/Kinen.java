import java.util.Scanner;

public class Kinen {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    int[] distances = {12, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    String numbers = input.replace("-", "");

    int totalDistance = 0;
        for (char c : numbers.toCharArray()) {
            int digit = Character.getNumericValue(c);
            totalDistance += ( distances[digit] * 2 );
        }

    System.out.println(totalDistance);
  }

}
