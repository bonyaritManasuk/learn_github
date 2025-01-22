
public class ex4 {
    public static void main(String[] args) {
        int[] num = {100, 200, 300};
        printArray(num);
    }

    public static void printArray(int[] Array) {
        for (int num : Array) {
            System.out.println(num);  // Corrected to use System.out.println()
        }
    }
}