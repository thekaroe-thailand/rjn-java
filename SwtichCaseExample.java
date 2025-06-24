public class SwtichCaseExample {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
