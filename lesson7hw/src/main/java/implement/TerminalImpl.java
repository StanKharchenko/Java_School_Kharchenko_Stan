package implement;

import TerminalUtils.AccountIsLockedException;
import TerminalUtils.PinValidator;
import TerminalUtils.TerminalServer;
import concept.Terminal;

/**
 * Created by Stan on 13.04.2017.
 */
public class TerminalImpl implements Terminal {

    @Override
    public Double getAccountBalance(Integer pin, TerminalServer ts) {
        try{
            PinValidator.checkPin(pin, ts);
            return ts.getAccountBalance();
        }catch(NullPointerException | AccountIsLockedException | IllegalArgumentException | InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void putCash(Double sum, Integer pin, TerminalServer ts) {
        try{
            PinValidator.checkPin(pin, ts);
            ts.setAccountBalance(ts.getAccountBalance() + sum);
        }catch(NullPointerException | IllegalArgumentException | AccountIsLockedException | InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getCash(Double sum, Integer pin, TerminalServer ts) {
        try{
            PinValidator.checkPin(pin, ts);
            ts.setAccountBalance(ts.getAccountBalance()- sum);
        }catch(NullPointerException | IllegalArgumentException | AccountIsLockedException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
