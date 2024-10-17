package vttp5_day6l;

public class App1 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            // The run method must be defined in the Runnable interface
            public void run() {
                for (int i = 0; i < 10; i++) {
                    // Corrected the print statement
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
            }
        });

        // Start the thread
        th.start();
    }
}