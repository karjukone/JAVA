import java.util.Random;

public class ParallelSum {
    private static final int ARRAY_SIZE = 100_000;
    private static final int[] numbers = new int[ARRAY_SIZE];

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = random.nextInt(100);
        }

        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Using " + numThreads + " threads.");

        SumThread[] threads = new SumThread[numThreads];
        int chunkSize = ARRAY_SIZE / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? ARRAY_SIZE : start + chunkSize;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        long totalSum = 0;
        for (SumThread thread : threads) {
            thread.join();
            totalSum += thread.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum);
    }

    static class SumThread extends Thread {
        private int start, end;
        private long partialSum;

        public SumThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            partialSum = 0;
            for (int i = start; i < end; i++) {
                partialSum += numbers[i];
            }
        }

        public long getPartialSum() {
            return partialSum;
        }
    }
}