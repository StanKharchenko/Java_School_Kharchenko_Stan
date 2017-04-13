package TerminalUtils;

/**
 * Created by Stan on 13.04.2017.
 */
public class AccountIsLockedException extends Exception {
    public AccountIsLockedException(String message) {
        super(message);
    }
}
