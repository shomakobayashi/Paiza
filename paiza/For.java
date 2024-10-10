import java.util.ArrayList;
import java.util.Iterator;

public class For {

    public static void main(String[] args) {
        

        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");

        // for(int i = 0; i < 5; i++) {
        //     System.out.println(names.get(i));
        // }

        // for(String str : names) {
        //     System.out.println(str);
        // }

        Iterator<String> it = names.iterator();
        
    }

}
