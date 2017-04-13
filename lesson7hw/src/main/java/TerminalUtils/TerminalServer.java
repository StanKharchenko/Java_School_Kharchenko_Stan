package TerminalUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Stan on 13.04.2017.
 */
public class TerminalServer {
    private Integer pin;
    Double accountBalance;
    int wrongPinTry;
    boolean block;

    public TerminalServer() {
        this.pin = 1234;
        this.accountBalance = 0d;
        this.wrongPinTry = 0;
        this.block = false;
    }

    public boolean checkPin(Integer outPin) throws InterruptedException {
        if (pin.equals(outPin)) {
            return true;
        } else {
            wrongPinTry++;
            if (wrongPinTry == 5) {
                wrongPinTry = 0;
                block = true;
                waitForUnblock();
            }

        }
        return false;
    }

    private void waitForUnblock() throws InterruptedException {
        TimeUnit.SECONDS.sleep(15);
        block = false;
    }

    public void setAccountBalance(Double accountBalance) throws AccountIsLockedException {
        if (!block) {
            this.accountBalance = accountBalance;
        }else {
            throw new AccountIsLockedException("Счет заблокирован");
        }
    }

    public Double getAccountBalance() throws AccountIsLockedException {
        if (!block)
            return accountBalance;
        throw new AccountIsLockedException("Счет заблокирован");
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
}
