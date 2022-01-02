package DIYGeneric;

public class GenericMethod {
    // <T> 泛型方法的标志，此处是无返回值方法
    // 如果没有<T>，则参数处的T无法存在
    public <T> void printValue(T value) {
        System.out.println("Value is " + value);
    }

    // 这样就给泛型加上了限制，使得泛型必须是Number类的众多子类的一个
    public <T extends Number> void printValueWithRestrict(T value) {
        System.out.println("Value is " + value);
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.printValue(111);

        GenericMethod method2 = new GenericMethod();
        method2.printValue("Hello World!");

        GenericMethod method3 = new GenericMethod();
        method3.printValue(3.1415);

        GenericMethod methodRes = new GenericMethod();
        // 受限于extends Number，这里只能是数字类型
        methodRes.printValueWithRestrict(10);
    }
}
