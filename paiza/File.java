import java.io.FileReader;

public class File {

    public static void main(String[] args) throws Exception {
        
        FileReader fr = new FileReader("data.txt");
        int input = fr.read();
        while(input != -1) {
            System.out.println((char)input);
            input = fr.read();
        }
        fr.close();
    }

}
