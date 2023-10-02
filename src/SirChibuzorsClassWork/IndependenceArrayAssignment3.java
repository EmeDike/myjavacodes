package SirChibuzorsClassWork;

public class IndependenceArrayAssignment3 {
    // A function that checks whether an element occurs in a list.
    public static boolean checkElement(int []arr, int element){

        for(int number : arr) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }


    }
