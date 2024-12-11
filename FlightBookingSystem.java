
  import java.util.Scanner;

public class FlightBookingSystem {
    
    // Define the total number of seats on the flight
    private static final int TOTAL_SEATS = 3;
    private static int availableSeats = TOTAL_SEATS;
    
    // Method to book a seat
    public static void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Booking successful! Remaining seats: " + availableSeats);
        } else {
            System.out.println("Error: No more seats available.");
        }
    }

    // Main method to run the system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Flight Booking System");
        
        while (true) {
            System.out.println("\n1. Book a seat");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    bookSeat();
                    break;
                case 2:
                    System.out.println("Thank you for using the Flight Booking System!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}