import java.util.Scanner;

public class Rpg {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //アイテム数
    int item = sc.nextInt();
    //アイテム値段
    int[] itemPrice = new int[item];

    //アイテム値段を格納
    for (int i = 0; i < item; i++) {
      itemPrice[i] = sc.nextInt();
    }

    //初期所持金
    int money = sc.nextInt();
    //アイテム購入回数
    int itemBuy = sc.nextInt();

    //アイテム購入処理
    for (int i = 0; i < itemBuy; i++) {
      //アイテム番号
      int itemNum = sc.nextInt()-1;
      //アイテム購入数
      int itemBuyNum = sc.nextInt();
      //購入処理
      int price = (itemPrice[itemNum] * itemBuyNum);
      //所持金との比較
      if (money >= price ){
        money -= price;
      } 
    }
    System.out.println(money);
  }
}
