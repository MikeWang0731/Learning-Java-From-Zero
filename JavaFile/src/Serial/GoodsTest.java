package Serial;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Goods goods1 = new Goods("0001", "Laptop", 3000);
//        Goods goods2 = new Goods("0002", "TV", 5500);
//        Goods goods3 = new Goods("0003", "Phone", 2100);

        // 文件输出流
        FileOutputStream outputStream = new FileOutputStream("src/myFile/GoodsList.txt");
        // 对象输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(goods1);
//        objectOutputStream.writeObject(goods2);
//        objectOutputStream.writeObject(goods3);

        outputStream.close();
        objectOutputStream.close();

        // 读取文件以验证是否写入正确
        FileInputStream inputStream = new FileInputStream("src/myFile/GoodsList.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Goods readTest = (Goods) objectInputStream.readObject();
        System.out.println(readTest.toString());

        inputStream.close();
        objectInputStream.close();
    }
}
