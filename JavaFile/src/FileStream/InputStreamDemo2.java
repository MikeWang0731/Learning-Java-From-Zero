package FileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建一个input stream，记得捕获异常
        FileInputStream inputStream = new FileInputStream("src/i-mooc.txt");
        // 读取到byte数组中
        byte[] readArray = new byte[20];  // 数组长度决定能读取多少
        inputStream.read(readArray);
        System.out.println(new String(readArray));
        inputStream.close();
    }
}
