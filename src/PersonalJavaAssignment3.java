public class PersonalJavaAssignment3 {
    public static void main(String[] args) {
      //  Write a Java program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number. For multiples of 5, print "Buzz" instead of the number. For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        int number = 100;

        for (int count = 1; count <= number; count++) {
            if (count % 3 ==0  && count % 5 == 0) {
                System.out.println("FUZZBUZZ");

            } else if (count % 3 == 0) {
                System.out.println("FUZZ");
            } else if (count % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(count);

            }

            }
        }
    }

