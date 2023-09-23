package Chapter5;

public class WeekEndSnacks1 {
    public static void main(String[] args) {
        int column = 5;
        int count;
        int number;
        for (count = 1; count <= column; count++) {
            for (number = 1; number <= count; number++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (count = 4; count >= 1; count--) {
            for (number = 1; number <= count; number++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
