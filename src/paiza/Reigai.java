public class Reigai {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("NullPointerException例外をcathしました。");
            System.out.println("-----スタックトレース（ここから）-----");
            e.printStackTrace();
            System.out.println("-----スタックトレース（ここまで）-----");
        }

        
    }

}
