import java.io.FileWriter;
import java.io.IOException;

public class Try {

    public static void main(String[] args) {
        
        FileWriter fw =null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello,２個目");
        } catch (Exception e){
            System.out.println("何らかの例外が発生しました。");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                ;
            }
        }
    }
}
