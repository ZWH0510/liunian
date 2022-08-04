package work.D010907.单列模式的应用;

public class T03 {
    public static void main(String[] args) {
        Single3 instance = (Single3) Single3.getInstance();
        System.out.println(instance);
    }
}
class Single3{
    private static String Single3;
    public static Object getInstance() {
        return Single3;
    }
    private static void Single3Holder(){

    }
}
