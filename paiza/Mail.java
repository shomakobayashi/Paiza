import java.util.Scanner;

public class Mail {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // 広告と判定するワードSを入力
    String words = sc.nextLine();
     // メールの件数Nを入力
    int num = sc.nextInt()
    sc.nextLine(); 
     
    for (int i = 0; i < num; i++) {
      String title = sc.nextLine();

      // 判定ワードSがメールタイトルに含まれているか確認
      if(title.contains(words)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
