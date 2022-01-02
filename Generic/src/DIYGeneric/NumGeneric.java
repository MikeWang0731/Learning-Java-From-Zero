package DIYGeneric;

public class NumGeneric<T> {
    // 泛型就像是一个模板
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        // 传入integer
        NumGeneric<Integer> num = new NumGeneric<>();
        num.setNum(2);
        System.out.println("Number is " + num.getNum());
        // 传入double
        NumGeneric<Double> num2 = new NumGeneric<>();
        num2.setNum(1.12345);
        System.out.println("Number is " + num2.getNum());

    }
}
