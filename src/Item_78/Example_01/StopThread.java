package Item_78.Example_01;

import java.util.concurrent.TimeUnit;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.02.2026)
 */
// Broken - How long would you expect this program to run?
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
                i++;
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
