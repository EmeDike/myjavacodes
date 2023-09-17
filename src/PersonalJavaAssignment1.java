public class PersonalJavaAssignment1 {
    public static void main(String[] args) {
        //Create a Java program that calculates the sum of all numbers from 1 to 100 that are divisible by 7 using a for loop and an if statement.
   int number = 100;
   int result = 1;
   int sum = 0;

                int count = 7;

                for (count = 7; count <= number; ) {

                    if (count / 7 == result) {
                        result++;
                        sum = sum + count;

                    }
                    count++;

                }
                      System.out.println(sum);
                }
            }



