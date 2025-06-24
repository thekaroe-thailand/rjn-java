import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;

public class I18N {
    public static void main(String[] args) {
        Date date = new Date();
        int dfLong = DateFormat.LONG;
        int dfMedium = DateFormat.MEDIUM;

        DateFormat dfJP = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.JAPAN);
        DateFormat dfFR = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.FRANCE);
        DateFormat dfTH = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.forLanguageTag("th-TH"));

        dfJP.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        dfFR.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        dfTH.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));

        try {
            byte[] bytes = dfTH.format(date).getBytes("UTF-8");

            System.out.println("Date and Time JP: " + dfJP.format(date));
            System.out.println("Date and Time FR: " + dfFR.format(date));
            System.out.println("Date and Time TH: " + new String(bytes, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
