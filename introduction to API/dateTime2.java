// using joda time API
// there is a no constructor available in this class 

import java.time.*;

public class dateTime2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        // inbuilt method for date 
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        // inbuilt method for time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nano=time.getNano();

        System.err.println(hour+":"+min+":"+sec+":"+nano);
    }
}
