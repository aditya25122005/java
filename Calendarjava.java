
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendarjava {
    public static void main(String[] args) {
        System.out.println("Learning about calendar class");

        Calendar c=Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());

        // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone().getID());
        // System.out.println(c.getTime());


        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

            GregorianCalendar cal =new GregorianCalendar();
            System.out.println(cal.isLeapYear(2024));



    }
    
}
