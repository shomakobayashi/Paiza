import java.util.Scanner;

public class Tesuryo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        String nyuryoku = sc.nextLine();
        int nyuryoku2 = Integer.parseInt(nyuryoku);

        int tesuryo = 120;
        int total = nyuryoku2 - tesuryo;
        System.out.println(total);
    }
}
