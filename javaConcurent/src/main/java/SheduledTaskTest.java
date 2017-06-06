

import javafx.concurrent.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newScheduledThreadPool;

/**
 * Created by 12 on 30.05.2017.
 */
public class SheduledTaskTest {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        for (int i=0; i<5; i++)
        {
            executor.schedule(new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    System.out.println("hi");
                    return null;
                }
            }, 1+i, TimeUnit.SECONDS);
        }



    }
}
