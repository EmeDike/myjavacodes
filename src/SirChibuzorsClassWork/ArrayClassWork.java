package SirChibuzorsClassWork;

public class ArrayClassWork {
    public static void main(String[] args) {
        int[][] items = {{34, 23, 65}, {23, 67, 44, 68}};

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "+");
            }
            System.out.println(" ");
        }
    }
}
