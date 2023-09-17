public class ForLoopClassWork2 {
    public static void main(String[] args) {
        int number = 50;
        for (;;) {
            if (number == 45) {
                System.out.println("MELODY");
                break; // Add a break statement to exit the loop
            }
            number--; // Decrement the number within the loop
            System.out.println(number);
        }
    }
}
