import java.util.Scanner;

public class culator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of passengers: ");
        int passengers = scanner.nextInt();
        
        System.out.print("Enter net distance in kilometers: ");
        int kilometers = scanner.nextInt();

        double total;
        if (passengers > 20) {
            total = (passengers * 10 * kilometers);
        } else {
            total = (passengers * 10 * kilometers) * 0.9; // 10% discount
        }

        // Displaying the results
        System.out.printf("Number of passengers: %d%n", passengers);
        System.out.printf("Distance: %d kilometers%n", kilometers);
        System.out.printf("Total fare: %.2f barh%n", total);
    }
}





