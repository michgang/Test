package com.example.test;

import java.time.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DateController {

    @RequestMapping("/api/time")
    public LocalTime date(){
        return LocalTime.now();
    }


    @RequestMapping("/api/time")
        public LocalDate localDate(){
            return LocalDate.now();
        }



}
