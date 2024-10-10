import java.util.ArrayList;
import java.util.Iterator;

public class Ite {

    public static void main(String[] args) {
        

        ArrayList<String> names = new ArrayList<String>();
        names.add("a");
        names.add("a");
        names.add("a");

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }

}
