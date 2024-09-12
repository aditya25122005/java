
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter {
    public static void main(String[] args) {
        //Date Time Formatter
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy--E h:m:s a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String form2=dt.format(df2);
        String myDate=dt.format(df);
        System.out.println(myDate);
        System.out.println(form2);


    }
    
}
