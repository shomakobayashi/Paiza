package paiza;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Log {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //検証するの文字列の数
    int num = sc.nextInt();
    //改行の消費
    sc.nextLine();
    //重要な文字列
    String importantStr = sc.nextLine();
    //検証する文字列
    String[] str = new String[num];
    //重要文字が含まれているかのフラグ
    boolean found = false;
    //結果出力
    List<String> list = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      str[i] = sc.nextLine();
      if(str[i].contains(importantStr)) {
        found = true;
        list.add(str[i]);
      }
    }
    if (!found) {
      System.out.println("None");
    } else {
      for (String is : list) {
        System.out.println(is);
      }
    }
  }
}
