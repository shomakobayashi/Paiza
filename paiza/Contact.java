import java.util.Scanner;

public class Contact {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dosu = sc.nextInt();
        int[] stock = new int[dosu + 1];
        
        for (int i = 1; i <= dosu; i++) {
            stock[i] = sc.nextInt();
        }

        //お客さんの数
        int kyaku = sc.nextInt();

        //販売できたお客さんの数
        int hanbaisu = 0;

        for(int j = 0; j < kyaku; j++) {
            int R_j = sc.nextInt();
            int L_j = sc.nextInt();
        
          // 在庫が右目と左目両方にあるか確認
          if(stock[R_j] > 0 && stock[L_j] > 0) {
              stock[R_j]--;
              stock[L_j]--;
              hanbaisu++;
          } 
        }
    //販売できた人数を出力
    System.out.println(hanbaisu);
    }    
}
