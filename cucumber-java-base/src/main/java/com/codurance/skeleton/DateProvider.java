package com.codurance.skeleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateProvider {
    String getDate(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
