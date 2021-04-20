package ru.grigan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class BeforeMyBirthday {
    private Calendar today;

    public BeforeMyBirthday() {
        this.today = Calendar.getInstance();
    }

    public int getDayBeforeMyBirthday(String month, String dayOfMonth) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        int year = today.get(Calendar.YEAR);
        Date date = null;
        try {
            date = format.parse(String.format("%s-%s-%s", year, month, dayOfMonth));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(format.format(date)));
    }
}
