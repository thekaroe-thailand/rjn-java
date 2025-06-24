public class SimpleExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        int[] numbers = { 1, 2, 3 };
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
