public class ex2 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75};

        
        int sum = 0;
        for (int score : scores) {
            sum += score;  // Corrected syntax here
        }
        System.out.println("Summary of point: " + sum);
    }
}