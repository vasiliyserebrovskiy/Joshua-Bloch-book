package Item_78.Example_02;

import java.util.concurrent.TimeUnit;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.02.2026)
 */
// Properly synchronized cooperative thread termination
public class StopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
           int i = 0;
           while (!stopRequested())
               i++;
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
        System.out.println("The End!");

    }
}
