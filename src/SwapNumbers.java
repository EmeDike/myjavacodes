public class SwapNumbers {

    public static void swapFirstAndSecondIndex(int[] numbers, int firstIndex, int secondIndex) {

        if (numbers != null && firstIndex >= 0 && secondIndex >= 0 && firstIndex < numbers.length && secondIndex < numbers.length) {

            int temp = numbers[firstIndex];
            numbers[firstIndex] = numbers[secondIndex];
            numbers[secondIndex] = temp;
        }
    }
}
