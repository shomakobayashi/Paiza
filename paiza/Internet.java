import java.io.InputStream;
import java.net.URL; 

public class Internet {

    public static void main(String[] args)  throws Exception{
        
        URL u =new URL("https://yahoo.co.jp");
        InputStream is = u.openStream();
        int i = is.read();

        while( i != -1 ) {
            char c = (char)i;
            System.out.println(c);
            i = is.read();
        }
    }
}
