import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer =new FileWriter("output.txt",true);
            String content ="mm";
            writer.write(content);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
