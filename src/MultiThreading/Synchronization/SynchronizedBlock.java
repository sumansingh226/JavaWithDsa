package MultiThreading.Synchronization;

class BookTheaterSheet1 {
    private int totalSheet = 10;
    private final Object lock = new Object(); // Create an object to use as a lock

    void bookSheet(int sheets) {
        synchronized (lock) {
            if (totalSheet >= sheets) {
                System.out.println(sheets + " sheets booked successfully.");
                totalSheet -= sheets;
                System.out.println(totalSheet + " available.");
            } else {
                System.out.println("Oops! Something went wrong during sheet booking. Please try again later.");
            }
        }
    }
}

class SynchronizedBlock extends Thread {
    static BookTheaterSheet1 b;
    int seats = 0;

    public void run() {
        b.bookSheet(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSheet1();

        SynchronizedBlock suman = new SynchronizedBlock();
        suman.seats = 7;

        SynchronizedBlock deepak = new SynchronizedBlock();
        deepak.seats = 6;

        suman.start();
        deepak.start();
    }
}
