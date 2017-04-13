package production;

import TerminalUtils.TerminalServer;
import concept.Terminal;
import implement.TerminalImpl;

import java.util.concurrent.TimeUnit;

/**
 * Created by Stan on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalServer ts = new TerminalServer();
        Terminal terminal = new TerminalImpl();
        Integer pin = null;
        pin = 1234;

        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(pin,ts));
        System.out.println("Вносим наличность: ");
        terminal.putCash(44.56d,1234, ts);
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(pin,ts));
        System.out.println("Снимаем наличность: ");
        System.out.println(terminal.getAccountBalance(pin,ts));
        terminal.getCash(13.00d,1234, ts);
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(pin,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(1111,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(1111,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(1111,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(1111,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(1111,ts));
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(pin,ts));
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Запрашиваем баланс: " + terminal.getAccountBalance(pin,ts));
    }

}
