import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Bhagyashri\\Desktop\\testout.txt");
            int i = fin.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fin.read();
            }
            fin.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
