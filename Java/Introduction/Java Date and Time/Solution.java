import java.util.Calendar;
import java.util.Locale;

public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month-1, day);
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.US).toUpperCase();
}