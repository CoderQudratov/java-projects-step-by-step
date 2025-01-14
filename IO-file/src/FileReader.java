import java.io.IOException;

public class FileReader {
    public static void main(String[] args){
        try {
            java.io.FileReader reader =new java.io.FileReader("input.txt");
            int charackter;
            while ((charackter=reader.read())!=-1){
                System.out.println((char) charackter);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}