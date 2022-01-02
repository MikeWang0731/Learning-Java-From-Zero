package StringStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/i-mooc.txt");
        // 将FileInputStream当作参数传给InputStreamReader
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        FileOutputStream outputStream = new FileOutputStream("src/myFile/i-mooc1.txt");
        OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);

        int read = 0;
        char[] charReadArray = new char[10];

        while ((read = streamReader.read()) != -1) {
            String s = new String(charReadArray);
            streamWriter.write(s);
        }
        streamWriter.flush(); // 将缓冲区的内容手动释放到文件

        inputStream.close();
        streamReader.close();
        outputStream.close();
        streamWriter.close();
    }
}
