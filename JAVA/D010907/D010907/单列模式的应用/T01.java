package work.D010907.单列模式的应用;
public class T01 {
    public static void main(String[] args) {
        Single1 instance = Single1.getInstance();
        System.out.println(instance);
    }
}
class Single1{
    private static String Single1;
    public static String getSingle1() {
        return Single1;
    }
    public static void setSingle1(String single1) {
        Single1 = single1;
    }
    public static work.D010907.单列模式的应用.Single1 getInstance(){
        if (Single1 == null) {
            System.out.println(Single1);
        }
        return null;
    }
}
