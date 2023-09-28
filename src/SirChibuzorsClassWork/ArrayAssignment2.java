package SirChibuzorsClassWork;

public class ArrayAssignment2 {
    public static void main(String[] args) {

        char[][] array = {
                {'x', 'o', 'x'},
                {'x', 'x', 'o'},
                {'o', 'x', 'x'}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
