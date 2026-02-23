package com.github.pamanne.dates;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {



        // old way
        Date date = new Date();

        System.out.println("date: " + date);

        SimpleDateFormat datetoday = new SimpleDateFormat("yyyy-MM:dd hh:mm:ss:z");
        System.out.println(datetoday.format(date));


        // new way

        newDateSystem();
    }

    private static void newDateSystem(){
        LocalDate date = LocalDate.now();
        System.out.println("date: " + date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("date: " + dateTime);

        dateTime=dateTime.plusHours(1); 
        System.out.println("Date after adding: "+ dateTime);

        LocalDate tomorrowDate = date.plusDays(1);
        System.out.println(tomorrowDate.isBefore(date));
        System.out.println(tomorrowDate.isAfter(date));

        System.out.println(ZonedDateTime.now());

    }

}
