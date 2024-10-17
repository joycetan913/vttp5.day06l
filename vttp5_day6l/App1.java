package vttp5_day6l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            // The run method must be defined in the Runnable interface
            /*public void run() {
                for (int i = 0; i < 10; i++) {
                    // Corrected the print statement
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
                */
            //}
        //});

        // Start the thread
        //th.start();
        MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();

        //use exec svc (execute w single thread)
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(my1);
        es.execute(my2);
        es.shutdown();
    }
}