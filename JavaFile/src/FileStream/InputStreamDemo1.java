package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建一个input stream，记得捕获异常
        FileInputStream inputStream = new FileInputStream("src/i-mooc.txt");
        int read = inputStream.read(); // 读取文件: read()
        while (read != -1) {
            System.out.print((char) read);
            read = inputStream.read(); // 循环读取文件中的内容
        }
        inputStream.close();
    }
}
