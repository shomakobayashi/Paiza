import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        
        ArrayList<Integer> points = new ArrayList<Integer>();

        //自動的にIntegerに変換
        points.add(10);
        points.add(20);
        points.add(30);
        for(int i : points) {
            System.out.println(i);
        }


    }

}
