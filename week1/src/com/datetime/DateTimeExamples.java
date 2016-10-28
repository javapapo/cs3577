package com.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;

/**
 * Created by javapapo on 28/10/2016.
 */
public class DateTimeExamples {

    public static void main(String[] args) {

        //--1
        LocalDate time = LocalDate.now();
        System.out.println(time);

        LocalDate time2 = LocalDate.of(2016, Month.OCTOBER, 29);
        System.out.println(time2);

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);

        //--2

        LocalDate now = LocalDate.now();
        LocalDate after = LocalDate.now().plusDays(90);
        System.out.println(after);

        Period period = Period.between(now,after);
        System.out.println("Days "+period.getDays());
        System.out.println("Months "+period.getMonths());

        //- format
        LocalDate now2 = LocalDate.now();
        String isoDate = now.format( DateTimeFormatter.ISO_DATE );
        System.out.println(isoDate);

        //- instant
        Instant now3 = Instant.now();
        System.out.println(now3.getEpochSecond());
        System.out.println(now3.getNano());



    }
}
