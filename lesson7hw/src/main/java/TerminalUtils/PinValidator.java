package TerminalUtils;

/**
 * Created by Stan on 13.04.2017.
 */
public class PinValidator {
    public static boolean checkPin(Integer pin, TerminalServer ts) throws NullPointerException, InterruptedException {
        if(pin == null) {
            throw new NullPointerException("Не введен пин-код!");
        }else{
            if(!ts.checkPin(pin)){
                throw new IllegalArgumentException("Неверный пин-код");
            }
        }
        return true;
    }
}
