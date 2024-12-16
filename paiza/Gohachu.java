import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Gohachu {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a[] = new int[num];
        Set<Integer> req = new HashSet<>();
        int total = 0;

        for(int i = 1; i <= num; i++) {
            req.add(i);
        }

        for(int i = 0; i < num; i++ ) {
            a[i] = scanner.nextInt();
            req.remove(a[i]);
        }
        total = req.size();
        System.out.println(total);
    }

}
