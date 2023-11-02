package MultiThreading.Synchronization;


class BookTheaterSheet {
    int totalSheet = 10;

    synchronized void bookSheet(int sheets) {  // by this
        if (totalSheet >= sheets) {
            System.out.println(sheets + " sheets booked successful .");
            totalSheet = totalSheet - sheets;
            System.out.println(totalSheet + " available.");
        } else {
            System.out.println("oops something went wrong during sheet booking pls try gain later .");
            System.out.println(" only " + totalSheet + "seats left.");
        }
    }
}

public class MovieBookApp extends Thread {
    static BookTheaterSheet b;
    int seats = 0;

    public void run() {
        b.bookSheet(seats);
    }

    public static void main(String[] args) {

        b = new BookTheaterSheet();
        MovieBookApp suman = new MovieBookApp();
        suman.seats = 7;
        suman.start();

        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 6;
        deepak.start();


    }
}
