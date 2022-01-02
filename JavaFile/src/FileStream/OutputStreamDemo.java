package FileStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 输出流：向文件输出(写入到文件)
        FileOutputStream outputStream = new FileOutputStream("src/myFile/newTest.txt");
        outputStream.write(50);
        outputStream.close();
    }
}
