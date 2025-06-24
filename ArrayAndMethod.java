import java.util.Arrays;

public class ArrayAndMethod {
    public static void main(String[] args) {
        int[] numbers = { 1, 5, 3, 12, 9, 8, 7, 11, 99, 88, 77, 55 };
        System.out.println("Array Length: " + numbers.length);
        System.out.println("Array element: " + Arrays.toString(numbers));

        // Arrays.fill(numbers, 99999);
        // System.out.println("Array After Fill: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int[] newArray = new int[50];
        System.out.println(Arrays.toString(newArray));
        Arrays.fill(newArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(newArray));
    }
}
