package DIYGeneric;

public class TwoNumberGeneric<T, U> {
    private T num1;
    private U num2;

    public void setNumbers(T number1, U number2) {
        setNum1(number1);
        setNum2(number2);
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public U getNum2() {
        return num2;
    }

    public void setNum2(U num2) {
        this.num2 = num2;
    }

    public void getTwoNumbers() {
        System.out.println("第一个数字是：" + getNum1());
        System.out.println("第二个数字是：" + getNum2());
    }

    public static void main(String[] args) {
        TwoNumberGeneric<Integer, Double> number = new TwoNumberGeneric<>();
        number.setNumbers(50,3.1415);
        System.out.println("输出两个数字：");
        System.out.println("第一个数字是：" + number.getNum1());
        System.out.println("第二个数字是：" + number.getNum2());
        System.out.println("==============");
        System.out.println("第二种输出方式");
        number.getTwoNumbers();
    }
}
