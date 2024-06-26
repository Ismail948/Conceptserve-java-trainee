import java.time.*;
import java.time.format.DateTimeFormatter;
public class datetimep {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("The current date is:--"+date);

        LocalTime time=LocalTime.now();
        System.out.println("The current time is:--"+time);

        LocalDateTime datetime=LocalDateTime.now();
        System.out.println("The current Date time is:--"+datetime);

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("hh-mm-ss dd-MM-yyyy"); 
        String formatedDateTime = current.format(formated);    
        System.out.println("Formated time and date:--"+formatedDateTime);
   
        Month curmonth=current.getMonth();
        System.out.println(curmonth);
    }
}
