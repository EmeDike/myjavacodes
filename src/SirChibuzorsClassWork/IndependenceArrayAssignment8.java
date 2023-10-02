package SirChibuzorsClassWork;

public class IndependenceArrayAssignment8 {
    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }

}
