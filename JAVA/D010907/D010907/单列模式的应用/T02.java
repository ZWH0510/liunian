package work.D010907.单列模式的应用;

public class T02 {
    public static void main(String[] args) {
        Single2 instance = Single2.getInstance();
        System.out.println(instance);
    }
}
class Single2{
    private Single2() {
    }
    private static Single2 eh = new Single2();
    public static Single2 getInstance() {
        return eh;
    }
}