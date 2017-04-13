package concept;

import TerminalUtils.TerminalServer;

/**
 * Created by Stan on 13.04.2017.
 */
public interface Terminal {
    Double getAccountBalance(Integer pin, TerminalServer ts);
    void putCash(Double sum, Integer pin, TerminalServer ts);
    void getCash(Double sum, Integer pin, TerminalServer ts);
}
