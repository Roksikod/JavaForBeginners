package ru.itmo.basics.lesson12;

import java.time.*;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();

//        System.out.println(date);

//        Date date2 = new Date(0);
//        System.out.println(date2);

//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//
//        System.out.println(calendar);

//        System.out.println(Arrays.toString(Month.values()));
//        System.out.println(Month.JANUARY.ordinal());
//        System.out.println(Month.DECEMBER.ordinal());
//
//        System.out.println(Month.APRIL);
//        System.out.println(Month.APRIL.name());


//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

//        Date timeZoneDate = null;
//        try {
//            timeZoneDate = dateFormat.parse("2010-05-23T09:01:02");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(timeZoneDate);

//        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("Asia/Singapore"));
//        System.out.println(zonedDateTime);

//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        System.out.println(dateFormat.format(date));

        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);


        LocalDateTime dateTime = LocalDateTime.of(2014, 5, 3, 12, 15, 30);
//        System.out.println(dateTime);

//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd")));

        LocalDate someDate = localDate.plusMonths(50);

//        System.out.println(someDate);

        Period period = Period.between(localDate, someDate);
//        System.out.println(period.getYears());

        Instant instant = Instant.now();

    }

    public Date convertToDateViaSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    public Date convertToDateViaSqlDate(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }

}
