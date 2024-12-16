import java.util.ArrayList;

public class Allay {

    public static void main(String[] args) {

     ArrayList<String> names = new ArrayList<String>();

     names.add("たなか");
     names.add("こば");
     System.out.println(names);

     ArrayList<String> namesB = new ArrayList<String>();
     namesB.add("aki");
     namesB.add("take");
     System.out.println(namesB.get(1));

     App ap = new App();
     ArrayList<App> namesC = new ArrayList<>();
     namesC.add(ap);
     System.out.println(ap);

    }
}
