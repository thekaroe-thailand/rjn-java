public class ForAndRangeExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        /*
         * SPEED
         * for (int i = 0; i < numbers.length; i++) {
         * System.out.println(numbers[i]);
         * }
         */

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
