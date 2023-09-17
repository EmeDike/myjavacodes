public class ClassWorkForLoop {
    public static void main(String[] args) {
        int number = 50;
        for (; ; ) {
            if (number == 44) {
               break;
            }
            System.out.println("infinite loop" );
            number -= 1;
        }
    }

}