import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Please enter the number that you want to search:");
        int yy = y.nextInt();
        Arrays.sort(numbers);  
        int index = Arrays.binarySearch(numbers, yy);
        if (index >= 0) {
            System.out.println("The location of " + yy + " is at index " + index);
        } else {
            System.out.println(yy + " was not found in the array.");
        }
        y.close();
    }
}
