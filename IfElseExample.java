public class IfElseExample {
    public static void main(String[] args) {
        int number = 20;

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("negative");
        }

        int score = 75;

        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        int age = 28;
        boolean hasId = true;

        if (age >= 100 && hasId) {
            System.out.println("Access");
        } else {
            System.out.println("Denined");
        }

        if (age >= 100 || hasId) {
            System.out.println("OR Access");
        } else {
            System.out.println("OR Denined");
        }

        if (age == 25) {
            System.err.println("ok");
        }
    }
}
