import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int check = 0;

        num = sc.nextInt();
        check = sc.nextInt();

        int[] prices = new int[num]; 

        for (int i = 0; i < num; i++) {
            prices[i] = sc.nextInt();
        }

        int total = 0;
        int maxCoupon =0;

        for (var price : prices) {
            total += price;
            if (price >= check && price > maxCoupon) {
                maxCoupon = price;
            }
        }
        total -= (maxCoupon / 2);

        System.out.println(total);
    }

}
