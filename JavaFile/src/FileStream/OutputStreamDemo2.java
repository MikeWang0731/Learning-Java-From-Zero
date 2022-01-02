package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 文件拷贝
        FileInputStream inputStream = new FileInputStream("src/happy.jpg");
        FileOutputStream outputStream = new FileOutputStream("src/myFile/HappyCopy.jpg");
        int read = 0;
        byte[] readArray = new byte[1024];
        while ((read = inputStream.read(readArray))!=-1){
            outputStream.write(readArray);
        }
        inputStream.close();
        outputStream.close();
    }
}
