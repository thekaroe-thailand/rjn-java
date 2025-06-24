public class LoopAvgNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 8, 99 };
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double avg = sum / numbers.length;
        System.out.println("avg = " + avg);
    }
}
