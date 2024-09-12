import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ps15_cwh_ {
    public static void main(String[] args) {
        ArrayList <String> l1=new ArrayList<>();
        l1.add("Aditya");
        l1.add("Abhaay");
        l1.add("Anurag");
        l1.add("Naman");
        l1.add("pawan");
        l1.add("ramesh");
        l1.add("Suresh");
        l1.add("Ankur");
        l1.add("Ashutosh");
        l1.add("GLA");
        for(String ele:l1){
            System.out.println(ele);
        }

        //ps 5
        HashSet<Integer> s=new HashSet();
        s.add(5);
        s.add(2);
        s.add(6);
        s.add(98);
        s.add(67);
        s.add(6);
        System.out.println(s);

        //ps2

        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //ps3
        Calendar a =Calendar.getInstance();
        System.out.println(a.get(Calendar.HOUR_OF_DAY)+" : "+a.get(Calendar.MINUTE)+" : "+a.get(Calendar.SECOND));


        //ps4

        LocalDateTime dt= LocalDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("h:m:s");
        String time=dt.format(df);
        System.out.println(time);

        





    }
    
}
