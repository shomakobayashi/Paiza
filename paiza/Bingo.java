import java.util.Scanner;

public class Bingo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    sc.nextLine();
    
    String[] status = new String[h];
    int[][] panelScores = new int[h][w];
    
    for (int i = 0; i < h; i++) {
       status[i] = sc.nextLine(); 
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        panelScores[i][j] = sc.nextInt();
      }
    }

     int total = 0;

     for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (status[i].charAt(j) == 'o') {
          total += panelScores[i][j];
        }
      }
     }
     System.out.println(total);
  }
}
