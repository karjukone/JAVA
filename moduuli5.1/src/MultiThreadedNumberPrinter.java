public class MultiThreadedNumberPrinter {

    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        System.out.println("Odd Thread: " + start);

        Thread evenThread = new Thread(() -> {
            for (int i = start + 1; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = start + 1; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        });

        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete.");
    }
}