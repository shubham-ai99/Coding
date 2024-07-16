package Java8.TimeAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeDateApiExample {

    public static void main(String[] args) {

        for(String local : ZoneId.getAvailableZoneIds()){
            System.out.println(local);
        }

        LocalDate ld = LocalDate.now(ZoneId.of("America/Merida"));
        System.out.println("America/Merida : " + ld );

        LocalDate ind = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India ISD : " + ind);

        LocalDateTime indDT = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India ISD : " + indDT);

    }
}
