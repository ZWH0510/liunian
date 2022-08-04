package work.D010901;
public class T09 {
    public static void main(String[] args) {
        try {
            check(-200);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void check(int num) throws MyException {
        if (num < 0) {
            try {
                throw new MyException("数值太小");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        if (num > 100) {
            try {
                throw new MyException("数值太大");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}