package com.lile.script;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Script6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("LocalDate: " + today);
        System.out.println(today.plusYears(1).getDayOfWeek());
        LocalTime teaTime = LocalTime.of(17, 30);
        System.out.println("LocalTime: " + teaTime);
        Duration timeGap = Duration.between(LocalTime.now(), teaTime);
        System.out.println("Duration: " + timeGap);
        System.out.println(timeGap.toMinutesPart());
        System.out.println(timeGap.toHours());
        System.out.println(timeGap.toMinutes());
        Locale locale = Locale.US;
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId kathmandu = ZoneId.of("Asia/Kathmandu");
        LocalDateTime tomorrow = LocalDateTime.of(today.plusDays(1), teaTime);
        System.out.println("tomorrow: " + tomorrow);
        ZonedDateTime londonDateTime = ZonedDateTime.of(tomorrow,london);
        System.out.println("londonDateTime: " + londonDateTime);
        ZonedDateTime kathmanduTime = londonDateTime.withZoneSameInstant(kathmandu);
        System.out.println("KathmanduTime: " + kathmanduTime);
        ZoneOffset offset = kathmanduTime.getOffset();
        System.out.println("Offset: " + offset);

        String datePattern = "EE','d' of 'MMMM yyyy ' at 'HH:mm z";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern, Locale.UK);

        String timeTxt = dateFormatter.format(kathmanduTime);

        System.out.println("timeTxt: " + timeTxt);

    }
}
