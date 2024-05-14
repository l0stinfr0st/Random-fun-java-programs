
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class testOutPutStream {

    public static void main(String[] args) throws Exception {

        FileOutputStream output = new FileOutputStream("temp.txt", true);

        for (int i = 0; i <= 10; i++) {
            output.write(i);
        }
        output.close();

        FileInputStream input = new FileInputStream("temp.txt");

        int value;

        while ((value = input.read()) != -1) {
            System.out.println(value);
        }
        input.close();

    }
}
