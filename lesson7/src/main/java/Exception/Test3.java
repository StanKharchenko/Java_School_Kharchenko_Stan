package Exception;

/**
 * Created by 12 on 11.04.2017.
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            anyMethod();
        } catch (Exception.MyException e) {
            e.printStackTrace();
        }
    }
    private static void anyMethod() throws MyException {
        if(true){
            throw new MyException("Бросаем исключение");
        }
    }
}
