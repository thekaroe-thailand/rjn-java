import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        // format
        // dd = วัน เช่น 03
        // MM = เดือน เชน 08
        // yyyy = ปี เช่น 2025
        // HH = ชั่วโมง เช่น 09, hh = ชั่วโมงแบบ 12 (0-12)
        // mm = นาที เช่น 02
        // ss = วินาที เช่น 08
        // a = AM, PM
        String pattern = "dd/MM/yyyy hh:mm:ss a";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
    }
}
